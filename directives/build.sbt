description := "monadic api for unfiltered"

unmanagedClasspath in (local("directives"), Test) <++=
  (fullClasspath in (local("spec"), Compile))


libraryDependencies +=
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.0" % "test"
