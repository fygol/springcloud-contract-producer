import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/user'
    }

    response {
        status 200
        body ("""
           {
            "id": 101,
            "name": "John Smith"
           }     
        """)
        headers {
            header('Content-Type': 'application/json;charset=UTF-8')
        }
    }
}
