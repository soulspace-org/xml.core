(ns org.soulspace.xml.xmltest
  (:require [clojure.data.xml :as xml]))

(defn ns-xml []
  (xml/element :fo:root {:xmlns:fo "http://www.w3.org/1999/XSL/Format"}))

(defn fo-root [& [attrs & content]]
  (xml/element (keyword (str "fo" ":" "root")) (or attrs {}) (remove nil? content)))

(defn fo-layout-master-set [& [attrs & content]]
  (xml/element (keyword (str "fo" ":" "layout-master-set")) (or attrs {}) (remove nil? content)))

(defn fo-simple-page-master [& [attrs & content]]
  (xml/element (keyword (str "fo" ":" "simple-page-master")) (or attrs {}) (remove nil? content)))


(println (xml/emit-str (ns-xml)))
(println (xml/indent-str (ns-xml)))

(println "fo:root\n"
         (xml/indent-str
           (fo-root
             {:xmlns:fo "http://www.w3.org/1999/XSL/Format"}
             (fo-layout-master-set {}
               (fo-simple-page-master
                 {:master-name "single" :page-height "297mm" :page-width "210mm"})))))
