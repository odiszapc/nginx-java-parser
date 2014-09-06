# Nginx configuration Java parser

#### Features
- Convert config file to AST tree using JavaCC parsing capabilities
- Build config files from scratch and serialize them
- Comments support

#### Examples
##### Parser

How to perform basic parsing of the following Nginx config:
```java
NgxConfig conf = TestUtils.parse("/etc/nginx/nginx.conf");
NgxParam workers = conf.findParam("worker_processes");       // Ex.1
NgxParam param = conf.findParam("http", "server", "listen"); // Ex.2
List<NgxEntry> rtmpServers = conf.findAll(NgxConfig.BLOCK, "rtmp", "server"); // Ex.3
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

Dumper:
```java
    NgxDumper dumper = new NgxDumper(conf);
    return dumper.dump(System.out);
```

