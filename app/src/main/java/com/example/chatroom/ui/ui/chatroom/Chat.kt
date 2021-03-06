package com.example.chatroom.ui.ui.chatroom

import kotlinx.serialization.Serializable
import java.util.*
@Serializable
data class Chat(var userId: String = "",
                var userfname : String = "",
                var userlname: String = "",
                var userphotourl : String= "",
                var message : String = "",
                var likes : Int = 0,
                var timedate : String = "",
                var messageId : String = "",
                //var listOfLikes: MutableList<String> = mutableListOf(),
                var likesMap : MutableMap<String, Boolean> = mutableMapOf()
                )