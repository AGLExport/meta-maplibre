SUMMARY     = "Momiyama weather application example."
DESCRIPTION = "AGL sample weather application for container integration."
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://README.md;md5=4bc8ba6bafb1cf320685dc6468a5c07a"

DEPENDS = " \
    qttools-native \
    qtbase \
    qtdeclarative \
    qtwayland \
    qtsvg \
    qtlocation \
    "

SRC_URI = "gitsm://github.com/maplibre/maplibre-native-qt.git;protocol=https;branch=main \
          "
SRCREV = "d929c783737120787b43417d9ef05da88da75dfd"

S = "${WORKDIR}/git"

inherit qt6-cmake pkgconfig

CXXFLAGS:append = " -Wno-error=shadow"

RDEPENDS:${PN} = " \
    qtsvg qtsvg-plugins qtsvg-qmlplugins \
    "
