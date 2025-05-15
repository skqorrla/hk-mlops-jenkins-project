def BuildApp() {
    echo '빌드하는 중~!~!~!'
}

def TestApp() {
    echo '테스트 하는 중 ~~'
}

def DeployApp() {
    echo '배포 하는 중 ~~'
    echo "배포 버전 : ${params.VERSION}"
}

return this