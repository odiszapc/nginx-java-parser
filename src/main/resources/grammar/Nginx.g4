grammar Nginx;

@parser::header {
    package com.github.odiszapc.nginxparser.antlr;
    import com.github.odiszapc.nginxparser.*;
}

@lexer::header {
    package com.github.odiszapc.nginxparser.antlr;
}

config returns [NgxConfig ret]
@init { $ret = new NgxConfig(); }
  :
  (
    statement { $ret.addEntry($statement.ret); }
    | block   { $ret.addEntry($block.ret); }
    | Comment { $ret.addEntry(new NgxComment($Comment.text)); }
  )+
  ;

statement returns [NgxParam ret]
:
(
  rewriteStatement { $ret = $rewriteStatement.ret; }
  |
  genericStatement { $ret = $genericStatement.ret; }
)
';';

genericStatement returns [NgxParam ret]
@init { $ret = new NgxParam(); }
  :
  Value  { $ret.addValue($Value.text); }
  (
    Value { $ret.addValue($Value.text); }
    |
    r=regexp { $ret.addValue($r.ret); }
  )*
  ;

block returns [NgxBlock ret]
@init { $ret = new NgxBlock(); }
  :
  (
    locationBlockHeader { $ret.getTokens().addAll($locationBlockHeader.ret); }
    |
    genericBlockHeader  { $ret.getTokens().addAll($genericBlockHeader.ret); }
  )
  Comment?
  '{'
  (
    statement { $ret.addEntry($statement.ret); }
    |
    b=block { $ret.addEntry($b.ret); }
    |
    if_statement { $ret.addEntry($if_statement.ret); }
    |
    Comment { $ret.addEntry(new NgxComment($Comment.text)); }
  )*
  '}'
  ;

genericBlockHeader returns [List<NgxToken> ret]
@init { $ret = new ArrayList<NgxToken>(); }
  :
  Value { $ret.add(new NgxToken($Value.text)); }
  (
    Value { $ret.add(new NgxToken($Value.text)); }
    |
    regexp { $ret.add(new NgxToken($regexp.ret)); }
  )*;

if_statement returns [NgxIfBlock ret]
@init { $ret = new NgxIfBlock(); }
  :
  id='if' { $ret.addValue(new NgxToken($id.text)); }
  if_body { $ret.getTokens().addAll($if_body.ret); }
  Comment?
  '{'
    (statement { $ret.addEntry($statement.ret); } )*
  '}'
  ;

if_body  returns [List<NgxToken> ret]
@init { $ret = new ArrayList<NgxToken>(); }
  :
  '('
  Value  { $ret.add(new NgxToken($Value.text)); }
  (Value { $ret.add(new NgxToken($Value.text)); })?
  (
    Value { $ret.add(new NgxToken($Value.text)); }
    |
    regexp { $ret.add(new NgxToken($regexp.ret)); }
  )?
  ')'
  ;

regexp returns [String ret]
@init { $ret = ""; }
:
(
  id='\\.' { $ret += $id.text; }
  | id='^' { $ret += $id.text; }
  | Value { $ret += $Value.text; }
  | '(' r=regexp { $ret += "(".concat($r.ret).concat(")"); } ')'
)+;

locationBlockHeader returns [List<NgxToken> ret]
@init { $ret = new ArrayList<NgxToken>(); }
  :
  id='location' { $ret.add(new NgxToken($id.text)); }
  (Value { $ret.add(new NgxToken($Value.text)); })?
  (
    Value { $ret.add(new NgxToken($Value.text)); }
    |
    regexp { $ret.add(new NgxToken($regexp.ret)); }
  )
;

rewriteStatement returns [NgxParam ret]
@init { $ret = new NgxParam(); }
  :
  id='rewrite' { $ret.addValue($id.text); }
  (Value { $ret.addValue($Value.text); } | regexp { $ret.addValue($regexp.ret); }) Value { $ret.addValue($Value.text); }
  (opt=('last' | 'break' | 'redirect' | 'permanent') { $ret.addValue($opt.text); })?
  ;

//QUOTED_STRING
//: '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"';


Value: STR_EXT | QUOTED_STRING | SINGLE_QUOTED
;

STR_EXT
  :
  [a-zA-Z0-9_/\.,\-:=~+!?$&^*\[\]@|]+;

Comment
    :
    '#' ~[\r\n]*;


QUOTED_STRING
  :
  '"' StringCharacters? '"'
  ;

fragment
StringCharacters
    :   (~["\\] | EscapeSequence)+
    ;

fragment
EscapeSequence
    :   '\\' [btnfr"'\\]?
    ;

SINGLE_QUOTED
:
'\'' ~['\\]* '\'';

WS
:
[ \t\n\r]+ -> skip ;