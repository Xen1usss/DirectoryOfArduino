package ks.directoryofarduino.data

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import ks.directoryofarduino.model.Topic

object TopicData {

    fun loadTopics(context: Context): List<Topic> {
        val json = context.assets.open("topics.json").bufferedReader().use { it.readText() }
        val type = object : TypeToken<List<Topic>>() {}.type
        return Gson().fromJson(json, type)
        }

}
