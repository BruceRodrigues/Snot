#!/bin/bash

java SnotMain < $1 > out
java -jar ../lib/jasmin.jar out
java Program
