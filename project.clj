(defproject http.async.client "0.2.0"
  :description      "Asynchronous HTTP Client for Clojure"
  :namespaces       [http.async.client]
  :dependencies     [[org.clojure/clojure "1.2.0"]
		     [org.clojure/clojure-contrib "1.2.0"]
		     [com.ning/async-http-client "1.1.0"]]
  :dev-dependencies [[swank-clojure "1.2.1"]
		     [autodoc "0.7.1"]
		     [org.clojars.neotyk/lein-javac "1.0.1"]
                     [lein-difftest "1.2.2"]
                     [org.eclipse.jetty/jetty-server "7.1.4.v20100610"]]
  :autodoc {:name "http.async.client"
            :web-src-dir "http://github.com/neotyk/http.async.client/blob/"
            :web-home "http://neotyk.github.com/http.async.client/autodoc/"
            :copyright "Copyright 2010 Hubert Iwaniuk"})
