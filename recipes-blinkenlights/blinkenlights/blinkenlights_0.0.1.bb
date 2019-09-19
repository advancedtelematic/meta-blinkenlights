# Copyright (C) 2019 Alex Humphreys <alex.humphreys@here.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Lights for dogfood day"
HOMEPAGE = "http://example.com/"
LICENSE = "MIT"
SECTION = ""
#DEPENDS = "python-native python-setuptools-native cmake-native"
DEPENDS = ""

#inherit cmake setuptools pythonnative

SRCREV="${AUTOREV}"
SRC_URI[md5sum] = "8c125b5da8c2f681a56a8c9bc1b72ef6"
SRC_URI = "https://github.com/advancedtelematic/blinkenlights.git"
# SRC_URI = "git@github.com:advancedtelematic/blinkenlights.git"

