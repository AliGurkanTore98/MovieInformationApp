package com.codingurkan.movieinformationapp

object SetData {

    fun setMovies(): List<InformationItem> {
        val moviesList = mutableListOf<InformationItem>()
        moviesList.add(
            InformationItem(
            "7.Koğuştaki Mucize" , R.drawable.yedincikogustakimucize,2019,"Aras Bulut İynemli",9
        ))
        moviesList.add(InformationItem(
            "The Batman" , R.drawable.thebatman,2022,"Robert Pattinson",8
        ))
        moviesList.add(InformationItem(
            "Mad Max 5" , R.drawable.madmax,2015,"Tom Hardy",8
        ))
        moviesList.add(InformationItem(
            "World War Z" , R.drawable.wordlwarz,2013,"Brad Pitt",7
        ))
        moviesList.add(InformationItem(
            "Arog" , R.drawable.arog,2008,"Cem Yılmaz",7
        ))
        moviesList.add(InformationItem(
            "Joohn Wick" , R.drawable.johnwick,2014,"Keanu Reeves",7
        ))

         return moviesList
    }

}