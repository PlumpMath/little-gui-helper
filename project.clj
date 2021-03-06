(defproject little-gui-helper "0.1.0-SNAPSHOT"
  :description "Helper functions and macros for building GUIs with SWT and Swing in Clojure."
  :dependencies [[org.clojure/clojure "1.2.0"]
		 [org.clojure/clojure-contrib "1.2.0"]]
  :dev-dependencies [[swank-clojure "1.2.1"]
		     [org.eclipse/swt-gtk-linux-x86 "3.5.2"]]
  :aot [#"little-gui-helper\..*"])
