/* 
TODO: Create the DLLNode class and implement the DoublyLinkedList constructor
and the empty methods below the constructor.
*/
class ListNode {
  constructor(data){
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}
/**
 * A class to represent a doubly linked list and contain all of it's methods.
 * A doubly linked list is a singly linked list that can be traversed in both
 * directions.
 */
class DoublyLinkedList {
    /**
     * Executed when the new keyword is used to construct a new DoublyLInkedList
     * instance that inherits these methods and properties.
     */
    constructor() {
      // TODO: implement the constructor.
      this.head = null;
      this.tail = null;
      this.size = 0;
    }
  
    /**
     * Creates a new node and adds it at the front of this list.
     * - Time: O(?).
     * - Space: O(?).
     * @param {any} data The data for the new node.
     * @returns {DoublyLinkedList} This list.
     */
    insertAtFront(data) {}
  
    /**
     * Creates a new node and adds it at the back of this list.
     * - Time: O(?).
     * - Space: O(?).
     * @param {any} data The data for the new node.
     * @returns {DoublyLinkedList} This list.
     */
    insertAtBack(data) {
      const newNode = new ListNode(data)
      if (this.isEmpty()) {
          this.head = newNode;
          this.tail = newNode;
          this.size++
          return this;
      }
      let oldTail = this.tail
      this.tail = newNode
      oldTail.next = newNode;
      newNode.prev = oldTail
      this.size++
      return this;
  }
  
  
    // EXTRA
    /**
     * Removes the middle node in this list.
     * - Time: O(?).
     * - Space: O(?).
     * @returns {any} The data of the removed node.
     */
    removeMiddleNode() {}
  
    /**
     * Determines if this list is empty.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {boolean} Indicates if this list is empty.
     */
    isEmpty() {
      return this.head === null;
    }


      /**
   * Inserts a new node with the given newVal after the node that has the
   * given targetVal as it's data.
   * - Time: O(?).
   * - Space: O(?).
   * @param {any} targetVal The node data to find.
   * @param {any} newVal Data for the new node.
   * @returns {boolean} Indicates if the new node was added.
   */
  insertAfter(targetVal, newVal) {
    if(this.isEmpty()){
      return false;
    }

    let runner = this.head
    let newNode = new ListNode(newVal);
    while(runner.next){
      if (runner.data === targetVal){
        let temp = runner.next
        runner.next = newNode
        newNode.next = temp
        temp.prev = newNode
        newNode.prev = runner
        this.length++
        return true;
      }
      runner = runner.next
    }
    return false;
  }

  /**
   * Inserts a new node with the given newVal before the node that has the
   * given targetVal as it's data.
   * - Time: O(?).
   * - Space: O(?).
   * @param {any} targetVal The node data to find.
   * @param {any} newVal Data for the new node.
   * @returns {boolean} Indicates if the new node was added.
   */
  insertBefore(targetVal, newVal) {
    if(this.isEmpty()){
      return false;
    }

    let runner = this.head
    let newNode = new ListNode(newVal);
    while(runner.next){
      if (runner.next.data === targetVal){
        let temp = runner.next
        runner.next = newNode
        newNode.next = temp
        temp.prev = newNode
        newNode.prev = runner
        this.length++
        return true;
      }
      runner = runner.next
    }
    return false;
  }

    /**
   * Retrieves the data from the nthLast node in this list.
   * - Time: O(?).
   * - Space: O(?).
   * @param {number} nthLast Indicates the position from the back of the list.
   * @returns {any}
   */
    nthToLast(nthLast) {}

    /**
     * Determines if the node's data of this list forms a palindrome.
     * - Time: O(?).
     * - Space: O(?).
     * @returns {boolean} Indicates if this list is a palindrome.
     */
    isPalindrome() {}
  
    /**
     * Determines if a given node in this list is in the left half of this list.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} node
     * @returns {boolean}
     */
    isNodeInLeftHalf(node) {}
  
    /**
     * Converts this list to an array of the node's data.
     * - Time: O(n) linear, n = list length.
     * - Space: O(n) linear, array grows as list length increases.
     * @returns {Array<any>} All the data of the nodes.
     */
    toArray() {
      const vals = [];
      let runner = this.head;
  
      while (runner) {
        vals.push(runner.data);
        runner = runner.next;
      }
      return vals;
    }
  
    /**
     * Adds all the given items to the back of this list.
     * @param {Array<any>} items Items to be added to the back of this list.
     * @returns {DoublyLinkedList} This list.
     */
    insertAtBackMany(items = []) {
      items.forEach((item) => this.insertAtBack(item));
      return this;
    }
  }
  
  const emptyList = new DoublyLinkedList();
  
  /**************** Uncomment these test lists after insertAtBack is created. ****************/
  const singleNodeList = new DoublyLinkedList().insertAtBack(1);
  const biNodeList = new DoublyLinkedList().insertAtBack(1).insertAtBack(2);
  const firstThreeList = new DoublyLinkedList().insertAtBackMany([1, 2, 3]);
  const secondThreeList = new DoublyLinkedList().insertAtBackMany([4, 5, 6]);
  const unorderedList = new DoublyLinkedList().insertAtBackMany([
    -5,
    -10,
    4,
    -3,
    6,
    1,
    -7,
    -2,
  ]);