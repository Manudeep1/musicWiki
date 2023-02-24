## MusicWiki
- Api : LastFm Api was used to developed to this app([LastFm](https://www.last.fm/api))
- Add Dependecy in app gradle following dependency :-
    - Add retrofit dependency to establish network calls to the api
    - Add GSON converter with to read the JSON response.
    - Add Coroutine dependency 
    - Add dependency for MVVM pattern dependency.
    - Add dependency Navigation dependency
    - Add Glide for image loading from URL.
- Now add data class according to your API responses.
- Now make Network call.
- Data will be used in recycler View to show the varrious data as per our requirements. We have also used navigation fragment to hover diffrent activity.
- At main activity we have 12 genre button as soon we click in expand button we 15 more genre. When the user click on genre it will take user to diffrent activity.
- The new Actvity will have title, and the description about genre, there will be navigation bar which will have "Artist", "Album", "Track". When clicked on the navigation bar it will take to the new fragment with each consit of recycler view.
- The Recycler view will consit the imformation as per UI. 
- Now time to implement MVVM pattern  for our app, so to use the MVVM we need to add view model, model factory, repository, which will fetch data from our web source. The UI will observe our view Model for change data.

# Decisions
- Choosing retrofit over volley and Okhttp
- Choosing glide over picasso.

