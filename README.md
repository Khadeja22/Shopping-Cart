# Shopping-Cart
This project includes seven separate classes and subclasses that represent the categories for items in a basic shopping cart.

The 'Shopping' class is the main class with the main method of the program, and it demonstrates the usage of the product classes and provides functionality to calculate the total cost of the shopping cart.

The 'Product' class provides the user with a basic representation of a shopping cart product. In it, there are attributes like price, name, and quantity. It provides methods to get and set these attributes, and a toString method for easy printing of product details.

'Women' and 'Men' are subclasses of the 'Clothing' class, which is a subclass of the 'Product' class. They represent women and men clothing. The 'Women' subclass includes an additonal attribute for color, while the 'Men' subclass includes an additional attribute for country origin (where the clothes were made). Both are represented through their separate, overidden, setName methods.

'Media' is a sublcass of the 'Products' class. It represents items like CDs, or DVDs, adding an additional attribute for the type of media. It provides methods to get and set the media type attribute.

'Electronics' is also a subclass of 'Product' and it represents electronic items, adding additional attributes for the power type and battery inclusion. It provides methods to get and set these attributes.

To use this program, download the ShoppingCart folder locally and open the files (which are the classes/subclasses) in src/com/products in your IDE of choice. I used Visual Studio Code.

