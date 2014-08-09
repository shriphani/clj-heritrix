# clj_heritrix

A clojure implementation of the [Heritrix REST API](https://webarchive.jira.com/wiki/display/Heritrix/Release+Notes+-+Heritrix+3.2.0).

## Usage

Load using:

```clojure
[clj_heritrix "0.1.0"]
```

And then you get:
```clojure
user> (use 'clj-heritrix.core :reload)
user> (create "https://localhost:8444/engine/" "test" "admin" "admin")
.
.
.
user> (build-job-configuration "https://localhost:8444/engine/job/test" "admin" "admin")
```

And so on. See [src/clj_heritrix/core.clj](src/clj_heritrix/core.clj).

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
