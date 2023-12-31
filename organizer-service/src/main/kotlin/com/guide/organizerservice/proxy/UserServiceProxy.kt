package com.guide.organizerservice.proxy

import com.guide.organizerservice.data.models.Dto.UserInfoDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam


@FeignClient(name = "currency-exchange")

interface  UserServiceProxy {
    @GetMapping("/user/find")
    fun userFindById(@RequestParam userId: Long?): UserInfoDto?
}