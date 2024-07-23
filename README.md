Firstly, when the MainActivity is opened, the init block will be executed first. After that, the onCreate() method will be executed, 
followed by the onStart() and onResume() methods, which will be executed one after another. When the user clicks on the button,
the application will navigate to the next activity by calling the onPause() method of the MainActivity, and will then execute the
onCreate(), onStart(), and onResume() methods of the next activity, which is MainActivity2. After this, the application will call the onStop() method of the MainActivity.

As the user navigates back from MainActivity2, the onPause() method of MainActivity2 will be called, followed by onRestart(), onStart(), and onResume() methods 
of the MainActivity in that order. Afterwards, the onStop() and onDestroy() methods of MainActivity2 will be called to destroy MainActivity2.
