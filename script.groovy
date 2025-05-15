def buildApp() {
    echo '빌드하는 중~!~!~!'
}

def testApp() {
    echo '테스트 하는 중 ~~'
}

def deployApp() {
    echo '배포 하는 중 ~~'
    echo "배포 버전 : ${params.VERSION}"
}

return this