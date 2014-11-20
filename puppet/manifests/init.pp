# == Class: tddtrainingapplication
#
# Module to build a TDD training application
#
class tddtrainingapplication(
  $environment = 'dev'
){
  class { 'tddtrainingapplication::install': }
}
