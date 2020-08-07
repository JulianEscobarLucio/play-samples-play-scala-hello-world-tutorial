// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/julieslu/Documents/Nueva carpeta/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Fri Aug 07 16:27:24 COT 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
