## workshop-java-01

Circular buffer

### 1. Data structure ? (Internal)

Array of String

### 2. Operations/Behavior/Methods ? user -> CB ?

writeData(string):void

readData(): string

isFull(): boolean

isEmpty(): boolean

setSize(int): void

### 3. Internal process ?

buffer size = 10 (default)
read pointer = 0
write pointer = 0
List of test cases

- TC01 => create_new_buffer_should_empty (Example)
  
- TC02 => create_new_buffer_with_default_size_should_be_10 (Example)
  
- TC03 => write_A_B_to_buffer_should_read_A_B_from_buffer (Example)
  
- TC04 => write_new_data_to_full_buffer_new_data_should_replace_first_data
  
- TC05 => read_before_write_data_should_be_null

## workshop-tennis-game
### Refactor
 - Change if-else to switch case
