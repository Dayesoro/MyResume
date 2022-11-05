
# MyResume

## Description
MyResume is a simple mobile application that allows it's users to see Daniel Ayesoro's Resume

## Features 🧰
* The application displays Daniel's Name/Username/title and his picture
* The application displays a little bit about Daniel and what he has to offer
* The application has an automatic dark-mode
* The application can be viewed in a landscape mode and is scrollable for easier viewing of content
* The application has support for french and spanish languages


## Description of the codebase 💻
* The Functionality of the app was written using kotlin in the MainActivity class
  * On click listeners was set on the image view links to enable the user navigate to external links
  * The binding object was also called in the MainActivity class which allowed easy access to the xml views(UI)

* The UI of the app was created using xml
  * The layout that was used was the constraint layout which allows for easy arrangement of the views in the layout.
  * The different views used was Material-Card view,Circle-Image view, Textview, Imageview and Scroll View

* All the texts and other language translations were stored in the strings folder
* The Image and social link icons were stored in the drawable folder and also accessed through the drawable folder


## Description of Design 🎨
* The profile picture, name, username, title and the social media links are housed in a cardview
* The User should click on the gmail, Twitter, Github and linkedin icons to get access to each individual social media links respectively
* There is a scrollable feature that allows the User to see content that is not shown on the screen
* All main headers like(About Me, My Skills, What I Offer To Your Company) all have the same fontSize[24sp], fontStyle[baloo_thambi], color[#2B6797],
  for consistency and simplicity.The interface is deliberately kept simple and cool so there's not too much happening on the screen visually so the user can focus on reading the resume. 
  
### Inspiration for the application design 🖇️
 Hira Riaz🔥 
 https://dribbble.com/shots/14210557-Finance-Mobile-Application-UX-UI-Design
 
 
 ## Description of Libraries used 📚
  * view-binding Library: This library helped to reduce boiler-plate code when assigning views to variables and make it easier to access the views in the MainActivity class.
  * de.hdodenhof-circleimageview: This library helped to easily and automatically make the profile picture circular.
  * constraint-layout library: This library helped to easily place and arrange views in the layout.
  
  ## Features i could have added If i had more time 📦
 * I could have added a dropdown for users to change language preferences 
 * I could have added a button to switch between light and dark mode
 * I could have added more languages
 * Better UI
 * view the picture in a larger format when its clicked on
 
 ## Link to the APK file 🖇️
  https://drive.google.com/file/d/1uYwx2v8gx_8ADX4KwiR6wL3xsyUWW4hG/view?usp=share_link
   
 ## Challenges faced 🛠
  * I was finding it hard to make the profile picture perfectly circular and had to get an external library that woul automatically do this
  * I was finding it hard to implement the different languages and had to do a lttle research on google; finnaly got my answers with the help of slack and youtube
  
 
 ## Appetize.io link 🖇️
  * https://appetize.io/app/4usvz4g4tht6egcmld4j35fdci?device=pixel4&osVersion=12.0&scale=75
