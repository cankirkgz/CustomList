<h1>MyList</h1>

  <p>MyList is a generic class in Java that represents a dynamic list structure with resizable capacity. It provides methods to add, remove, get, and set elements in the list.</p>

  <h2>Features</h2>
  <ul>
    <li>The initial capacity of the list is 10, and it dynamically grows by doubling its capacity when needed.</li>
    <li>The list allows storing elements of any data type using Java generics.</li>
    <li>It supports adding elements to the list, removing elements by index, getting elements by index, and setting elements at a specific index.</li>
    <li>The <code>size()</code> method returns the current number of elements in the list.</li>
    <li>The <code>getCapacity()</code> method returns the current capacity of the list.</li>
  </ul>

  <h2>Usage</h2>

  <ol>
    <li>Create an instance of the MyList class:</li>
    <pre><code>MyList&lt;Integer&gt; myList = new MyList&lt;&gt;();</code></pre>

    <li>Add elements to the list:</li>
    <pre><code>myList.add(10);
myList.add(20);
myList.add(30);</code></pre>

    <li>Get elements from the list by index:</li>
    <pre><code>int element = myList.get(1);
System.out.println("Element at index 1: " + element);</code></pre>

    <li>Set an element at a specific index:</li>
    <pre><code>myList.set(2, 40);
System.out.println("Updated list: " + myList);</code></pre>

    <li>Remove an element by index:</li>
    <pre><code>int removedElement = myList.remove(0);
System.out.println("Removed element: " + removedElement);</code></pre>
  </ol>

  <h2>License</h2>
  <p>This project is licensed under the MIT License - see the <a href="LICENSE">LICENSE</a> file for details.</p>

  <h2>Contribution</h2>
  <p>Contributions are welcome! If you have any suggestions, bug reports, or feature requests, please open an issue or submit a pull request.</p>

  <h2>Author</h2>
  <p>Created by Your Name</p>

  <h2>Acknowledgements</h2>
  <p>Special thanks to <a href="https://openai.com/">OpenAI</a> for their support in developing this project.</p>

  <h2>References</h2>
  <ul>
    <li><a href="https://docs.oracle.com/javase/8/docs/api/">Java Documentation</a></li>
    <li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList Documentation</a></li>
  </ul>
