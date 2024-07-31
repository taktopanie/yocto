DESCRIPTION = "This is a simple mysecond2 app"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS+= " qtbase wayland "

SRC_URI = "file://mysecond2.pro \
           file://mainwindow.cpp \
           file://mainwindow.h \
           file://mainwindow.ui \
           file://main.cpp \
          "

S = "${WORKDIR}"

inherit qt6-qmake

do_install() {
	install -d ${D}${bindir}
	install -m 0755 mysecond2 ${D}${bindir}
}

FILES:${PN} += "${bindir}/mysecond2"



