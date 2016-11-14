
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/conf/routes
// @DATE:Wed Nov 09 11:47:19 CST 2016


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
