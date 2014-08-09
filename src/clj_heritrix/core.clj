(ns clj-heritrix.core
  "Clojure implementation of the
   Heritrix rest api"
  (:require [clj-http.client :as client]))

(defn send-action
  [end-point action form-params user pass]
  (client/post end-point
               {:digest-auth [user pass]
                :form-params (merge form-params
                                    {:action action})
                :insecure? true
                :throw-entire-message? true}))

(defn create
  [engine-loc job-name user pass]
  (send-action engine-loc
               "create"
               {:createpath job-name}
               user
               pass))

(defn add-job-directory
  [engine-loc path user pass]
  (send-action engine-loc
               "add"
               {:addpath path}
               user
               pass))

(defn build-job-configuration
  [job-loc user pass]
  (send-action job-loc
               "build"
               nil
               user
               pass))

(defn launch-job-configuration
  [job-loc user pass]
  (send-action job-loc
               "launch"
               nil
               user
               pass))

(defn rescan-job-directory
  [engine-loc user pass]
  (send-action engine-loc
               "rescan"
               nil
               user
               pass))

(defn pause-job
  [job-loc user pass]
  (send-action job-loc
               "pause"
               nil
               user
               pass))

(defn unpause-job
  [job-loc user pass]
  (send-action job-loc
               "unpause"
               nil
               user
               pass))

(defn terminate-job
  [job-loc user pass]
  (send-action job-loc
               "terminate"
               nil
               user
               pass))

(defn teardown-job
  [job-loc user pass]
  (send-action job-loc
               "teardown"
               nil
               user
               pass))


(defn checkpoint-job
  [job-loc user pass]
  (send-action job-loc
               "checkpoint"
               nil
               user
               pass))
