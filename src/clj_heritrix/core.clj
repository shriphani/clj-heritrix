(ns clj-heritrix.core
  "Clojure implementation of the
   Heritrix rest api"
  (:require [clj-http.client :as client]))

(defn create
  [engine-loc job-name user pass]
  (client/post engine-loc
               {:digest-auth [user pass]
                :form-params {:createpath job-name
                              :action "create"}
                :insecure? true
                :throw-entire-message? true}))

