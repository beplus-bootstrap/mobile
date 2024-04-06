source 'https://rubygems.org'

# You may use http://rbenv.org/ or https://rvm.io/ to install and use this version
ruby File.read(File.join(__dir__, '.ruby-version')).strip

gem 'ffi', '1.15.5' # @todo This is locked to the latest version before 1.16.0 which is unable to compile (Sept 24 2023)
gem 'mutex_m' # mutex_m was loaded from the standard library, but will no longer be part of the default gems since Ruby 3.4.0. Add mutex_m to your Gemfile or gemspec. Also contact author of activesupport-7.0.8 to add mutex_m into its gemspec.
gem 'bigdecimal' # bigdecimal was loaded from the standard library, but will no longer be part of the default gems since Ruby 3.4.0. Add bigdecimal to your Gemfile or gemspec. Also contact author of activesupport-7.0.8 to add bigdecimal into its gemspec.
gem 'activesupport', '7.0.8' # @todo This is locked to the latest version before 7.1.0 which has an error (Oct 05 2023)

gem 'cocoapods', '1.14.3' # @todo '~> 1.15' when resolved: https://github.com/facebook/react-native/issues/42698
gem 'fastlane'
