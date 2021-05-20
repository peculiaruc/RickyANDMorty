package com.peculiaruc.rickyandmortyapp.viewModel

class MainViewModel {

//    class MainActivityViewModel : ViewModel() {
//
//        private val characters: MutableLiveData<CharacterData> by lazy {
//            MutableLiveData<CharacterData>().also {
//                fetchName()
//            }
//
//        }
//
//        fun getCharacters(): LiveData<CharacterData> {
//            return characters
//        }
//
//        private fun fetchName() {
//            val apiInterface = RetrofitService.getRetrofitInstance().fetchCharacterName()
//            apiInterface.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(object : SingleObserver<Response<CharacterData>> {
//                    override fun onSuccess(t: Response<CharacterData>) {
//                        characters.value = t.body()
//                        Log.d("character", "" + t.body())
//                    }
//
//                    override fun onSubscribe(d: Disposable) {
//                    }
//
//                    override fun onError(e: Throwable) {
//                    }
//
//
//                })
//        apiInterface.enqueue(object : Callback<CharacterData> {
//
//            override fun onFailure(call: Call<CharacterData>, t: Throwable) {
//            }
//
//            override fun onResponse(call: Call<CharacterData>, response: Response<CharacterData>) {
//                characters.value = response.body()
//                Log.d("character", "" + response.body())
//            }
//
//        })
       // }
}