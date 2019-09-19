# Copyright (C) 2019 Alex Humphreys <alex.humphreys@here.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Lights for dogfood day"
HOMEPAGE = "http://example.com/"
LICENSE = "MIT"

SRCREV="${AUTOREV}"
SRC_URI[md5sum] = "8c125b5da8c2f681a56a8c9bc1b72ef6"
SRC_URI = "git://github.com/advancedtelematic/blinkenlights.git;protocol=http;branch=master file://blinkenlights.service"
# SRC_URI = "git@github.com:advancedtelematic/blinkenlights.git"

LIC_FILES_CHKSUM = "file://LICENSE;md5=c38a147657b98318df1f12ee6a660704"

S = "${WORKDIR}/git"

SYSTEMD_SERVICE_${PN} = "blinkenlights.service"

do_install() {
   install -d ${D}${systemd_system_unitdir}
   install -m 0644 ${WORKDIR}/blinkenlights.service ${D}${systemd_system_unitdir}
}

# DEPENDS_${PN} = "${PYTHON_PN}-modules"
inherit setuptools pkgconfig systemd
