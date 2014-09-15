# Nginx configuration Java parser

This library helps in analyzing Nginx web server configuration files, looking up for specified parameters, blocks, regular expressions or comments. Then AST can be modified and converted back to plain file.

#### Features
- Convert config file to AST tree using ANTLR4 parsing capabilities
- The same is available for JavaCC too (deprecated)
- Rebuild config files and dump them back to *.conf
- Nested blocks support
- If statements support
- Unquoted regexp within location/rewrite/if statements support
- Comments support

#### Installation
Add the following dependency to your POM:
```xml
<dependency>
    <groupId>com.github.odiszapc</groupId>
    <artifactId>nginxparser</artifactId>
    <version>0.9.0</version>
</dependency>
```

#### Examples
##### Parser

How to perform basic parsing of the following Nginx config:
```java
NgxConfig conf = TestUtils.parse("/etc/nginx/nginx.conf");
NgxParam workers = conf.findParam("worker_processes");       // Ex.1
workers.getValue(); // "1"
NgxParam listen = conf.findParam("http", "server", "listen"); // Ex.2
listen.getValue(); // "8889"
List<NgxEntry> rtmpServers = conf.findAll(NgxConfig.BLOCK, "rtmp", "server"); // Ex.3
for (NgxEntry entry : rtmpServers) {
    ((NgxBlock)entry).getName(); // "server"
    ((NgxBlock)entry).findParam("application", "live"); // "on" for the first iter, "off" for the second one
}
```

/etc/nginx/nginx.conf:
```
worker_processes  1;            # <- Ex.1

http {
    server {
        listen       8889;      # <- Ex.2
        server_name  localhost;
    }
}

rtmp {
    server {                    # <- Ex.3 (first)
        listen 1935;
        application myapp {
            live on;
        }
    }

    server {                    # <- Ex.3 (second)
        listen 1936;
        application myapp2 {
            live off;
        }
    }
}
```

##### Dumper

```java
NgxDumper dumper = new NgxDumper(conf);
return dumper.dump(System.out);
```

#### Authors
Alexey Plotnik (odiszapc@gmail.com, http://twitter.com/odiszapc) I do it just because I like it.

#### License
Apache 2.0
