#!/bin/sh
find . | grep .adoc | xargs jruby /Library/Ruby/Gems/1.8/gems/asciidoctor-0.1.4/bin/asciidoctor