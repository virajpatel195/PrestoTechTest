# PrestoTechTest



this project contains two modules 



-----------------------------------------

1 Tech Screen Test (socks sorting problem)

-----------------------------------------

Problem : 

Given a string that represents a list of socks, print out the pairs of unique identifiers that

is associated with each sock.

Matching socks are defined as a pair of socks - one left, one right - that are the same

color.

Example input



String socksString =1/blue/right,2/blue/right,3/red/right,4/blue/left,5/purple/left,6/red/left,7/green/left,8/red/left,9/blue/left;



Expected

1 4

3 6

2 9



bonus expected 

3 1

5 2

6

4

7



Solution: 

For this problem, go through the following steps.

> This solution is developed in Test Driven Development-TDD flow 

> Create  failed test first > create a program for pass this test> test pass> create another test 

  > achieved unit testing 

  > achieved code quality 

> Created a parser method from string to an array list 

> Created a separator method for sorting socks 

> Created an opposite separator method for sorting socks 

> Created front end with "run "button and input-output text views 

> Install application > on first-page click "Run" button > see output and bonus output in below text view 





------------------

2 Photo Gallery 

------------------

Problem:

Utilizing the Android framework, design a mobile app that will show a series of images as a gallery fetched from Flickr’s API.

Specifics

The image data you display should be fetched from the following endpoint:

https://api.flickr.com/services/rest/?api_key=949e98778755d1982f537d56236bb

b42&amp;method=flickr.photos.search

Each entry in the list structure should display:



a. Image

b. Image size

c. Image dimensions

d. Title



Solution: 

created an android application for a photo gallery 

> install photo gallery application 

> make sure you are connected to the internet otherwise message will pop up with "No internet"

> you will get first activity which is having recycler view with a list of photos 

> when you are opening application it is initializing volley lib for managing network call queue

> by selecting photo it will open a fullscreen photo with name, size, dimensions 

> full-screen photo is using fragment and view pager for a slideshow of photos in full screen 





using following webservice with addtional params

"https://api.flickr.com/services/rest/?api_key=949e98778755d1982f537d56236bbb42&method=flickr.photos.search

&media=photos

&format=json

&per_page=500

&nojsoncallback=1



> chosen JSON as response as JSON is faster and lightweight in parsing

> selected Recyclerview for best performance

> selected fragment and pager, for light weight slide show of images 

> using glide lib for downloading images from server for achieving the best performance in front of picaso 

> using volley lib for network calls because it maintaining a background queue for network calls 



For future :

> photo size management can be better flicker is not providing an image in all sizes 

> unit testing as done in an application of socks sorting 

> paging functionality for more images 



Screenshot:

look in the main folder for screenshots

