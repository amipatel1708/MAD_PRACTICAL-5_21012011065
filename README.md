# MAD_Practical_5_21012011065

# What is Intent? 
An Intent in Android is a messaging object that represents an operation to be performed, typically involving communication between components like activities, services, and broadcast receivers. Intents can be used to start activities, start services, deliver broadcasts, and more. They can carry information such as action, data, and extras, which are used to determine the target component or the action to be performed.

# Write down types of Intent and types of Intent Action. 

* There are two primary types of Intents in Android:

Explicit Intent: 

An explicit intent is used to specify a specific target component to be invoked. It explicitly provides the component's class name that should handle the intent. This is typically used when you want to start an activity or service within your own app.

Implicit Intent: 

An implicit intent does not specify a specific target component. Instead, it declares an action and data type, allowing the system to determine which component should handle the intent based on its intent filters. Implicit intents are useful for invoking components from other apps or for actions that could be handled by multiple components.

Intent Actions are predefined string constants that represent various operations or actions that can be performed using Intents. 

* Here are some common Intent Actions:

ACTION_VIEW: Used to display data to the user, such as opening a web page, displaying a map, or viewing an image.

ACTION_EDIT: Used to edit an existing data item, such as editing a contact's information.

ACTION_SEND: Used to send data to another app, like sharing text, images, or files.

ACTION_DIAL: Used to dial a phone number specified in the intent's data.

ACTION_CALL: Used to initiate a call to a specific phone number specified in the intent's data.

ACTION_PICK: Used to pick an item from a list, like selecting a contact from the address book.

ACTION_GET_CONTENT: Used to allow the user to pick a particular type of content, such as selecting an image from the gallery.

ACTION_MAIN: The main entry point of the app, typically used as the intent action for the launcher activity.

ACTION_BATTERY_LOW: Broadcast action indicating that the battery is now low.

ACTION_POWER_CONNECTED: Broadcast action indicating that the device has been connected to a power source.


# AIM: 
Create an application which demonstrates implicit Intent for following features. 

# OUTPUT:

# Dark Theme

![DARK THEME_PRACTICAL-5](https://github.com/amipatel1708/MAD_Practical_5_21012011065/assets/139481113/b63b6421-b932-4749-88ea-c6fd552edf81)

# Light Theme

![LIGHT THEME_PRACTICAL-5](https://github.com/amipatel1708/MAD_Practical_5_21012011065/assets/139481113/1fc58eba-86aa-4451-98e9-1afb3c70efae)
