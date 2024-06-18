plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.jetbrainsCompose) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.build.config) apply false
    id "org.sonarqube" version "4.4.1.3373"

}

sonar {
  properties {
    property "sonar.projectKey", "colin-sonarsource_Charts"
    property "sonar.organization", "colin-sonarsource"
    property "sonar.host.url", "https://sonarcloud.io"
  }
}
