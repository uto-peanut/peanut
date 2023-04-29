function loginApi(data){
    return $axios({
        'url':'/user/login',
        'method':'post',
        data
    })



    function loginoutApi(data){
        return $axios({
            'url':'/user/loginout',
            'method':'post',
        })
    }

}