package ks.directoryofarduino.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import ks.directoryofarduino.data.TopicData
import ks.directoryofarduino.model.Topic

class TopicViewModel(application: Application): AndroidViewModel(application) {
    val topics = MutableLiveData<List<Topic>>()

    init {
        topics.value = TopicData.loadTopics(application.applicationContext)
    }
}