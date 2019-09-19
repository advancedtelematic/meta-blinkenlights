# Copyright (C) 2019 Alex Humphreys <alex.humphreys@here.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Lights for dogfood day"
HOMEPAGE = "http://example.com/"
LICENSE = "MIT"

SRCREV="${AUTOREV}"
SRC_URI[md5sum] = "8c125b5da8c2f681a56a8c9bc1b72ef6"
SRC_URI = "git://github.com/advancedtelematic/blinkenlights.git;protocol=http;branch=master"
# SRC_URI = "git@github.com:advancedtelematic/blinkenlights.git"

LIC_FILES_CHKSUM = "file://LICENSE;md5=c38a147657b98318df1f12ee6a660704"

S = "${WORKDIR}/git"

# DEPENDS_${PN} = "${PYTHON_PN}-modules"
inherit setuptools pkgconfig

RDEPENDS_${PN} = "python-dateutil rpi-gpio"
