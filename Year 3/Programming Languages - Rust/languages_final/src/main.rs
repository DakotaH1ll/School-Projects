extern crate time;
extern crate rand;

use std::cmp::Ordering;
use rand::Rng;
use std::io;
use std::io::prelude::*;
type OrderFunc<T> = Fn(&T, &T) -> bool;


struct Person { // Creates the struct for a single person
    first_name: &'static str,
    last_name: &'static str,
}

struct Team { // Creates the struct for a two man team
  leader: Person,
  member: Person,
}

fn main() {

  for x in 0..25 {
      println!("");
    }

    println!("Programming Languages Final Project");
    println!("By: Dakota Hill (100523538)");
    println!("---------------------------");
    cont();

    println!("Current Test: Vectors");
    println!("---------------------------");
    vector_test();
    cont();

    println!("Current Test: Structs");
    println!("---------------------------");
    struct_test();
    cont();

    println!("Current Test: Bubble Sort");
    println!("---------------------------");
    bubble_sort_test();
    cont();

    println!("Current Test: Insertion Sort");
    println!("---------------------------");
    insertion_sort_test();
    cont();

    println!("Current Test: Quick Sort");
    println!("---------------------------");
    quick_sort_test();
    cont();

    println!("Current Test: Guessing Game");
    println!("---------------------------");
    guessing_game();
}

// Messing around with vectors
fn vector_test() {
  // Populate a vector with super hero names
  let mut vec = Vec::new();
  vec.push("Thor");
  vec.push("Black Widow");
  vec.push("Iron Man");     // Populating the vector
  vec.push("Hawkeye");
  vec.push("Captain America");
  vec.push("Hulk");

  // Populate a vector with civilian names (pre-sorted)
  let mut vec2 = Vec::new();
  vec2.push("Bruce Banner");
  vec2.push("Clint Barton");
  vec2.push("Steve Rogers");    // Populating the other vector
  vec2.push("Thor Odinson");
  vec2.push("Tony Stark");
  vec2.push("Natasha Romanoff");

  // Print out incorrect civilian -> hero pairs
  println!("{} is {}", vec2[0], vec[0]);
  println!("{} is {}", vec2[1], vec[4]);
  println!("{} is {}", vec2[2], vec[2]); // Hardcoded Pairings
  println!("{} is {}", vec2[3], vec[5]);
  println!("{} is {}", vec2[4], vec[1]);
  println!("{} is {}", vec2[5], vec[3]);
  println!("");

  println!("Wait a minute...");
  cont();

  // Use rust provided sort function
  vec.sort();
  vec2.sort();

  // Corrected pairings
  println!("{} is {}", vec2[0], vec[3]);
  println!("{} is {}", vec2[1], vec[2]);
  println!("{} is {}", vec2[2], vec[0]);
  println!("{} is {}", vec2[3], vec[1]); // Hardcoded Pairings
  println!("{} is {}", vec2[4], vec[5]);
  println!("{} is {}", vec2[5], vec[4]);
}

  // Learning Structs
fn struct_test() {
  let iron_man = Person { first_name: "Tony", last_name: "Stark" };
  let war_machine = Person { first_name: "James", last_name: "Rhodes" };    // People Structs
  let captain_america = Person { first_name: "Steve", last_name: "Rogers" };
  let winter_soldier = Person { first_name: "Bucky", last_name: "Barnes" };

  let team_tony = Team { leader: iron_man, member: war_machine};            // Team Structs
  let team_cap = Team { leader: captain_america, member: winter_soldier};

  // Displaying struct data with . identfier
  println!("Team Iron Man is lead by {} {}", team_tony.leader.first_name, team_tony.leader.last_name);
  println!("He leads {} {}", team_tony.member.first_name, team_tony.member.last_name);
  println!("Team Captain America is lead by {} {}", team_cap.leader.first_name, team_cap.leader.last_name);
  println!("He leads {} {}", team_cap.member.first_name, team_cap.member.last_name);
}

fn bubble_sort<T: Ord>(items: &mut[T]) {
    let mut n = items.len();
    let mut swapped = true;

    while swapped {
        swapped = false;

        for i in 1..n {
            if items[i - 1] > items[i] {
                items.swap(i - 1, i);
                swapped = true;
            }
        }

        n = n - 1;
    }
}

fn bubble_sort_test() {
let less_start_time = time::precise_time_ns();

// Sort numbers
println!("");
let mut numbers = [80, 32, 19, 56, -15, 1, -1, 0, 782, 1];
println!("US: {:?}", numbers);

bubble_sort(&mut numbers);
println!("S: {:?}", numbers);

// Sort strings
println!("");
let mut strings = ["Hulk", "Captain America", "Black Widow", "Iron Man", "Thor", "Hawkeye"];
println!("US: {:?}", strings);

bubble_sort(&mut strings);
println!("S: {:?}", strings);

//sort chars
println!("");
let mut chars = ["b", "A", "h", "Z", "Q", "q"];
println!("US: {:?}", chars);

bubble_sort(&mut chars);
println!("S: {:?}", chars);

let less_end_time = time::precise_time_ns();


//Testing Worst Case Scenario (One Unsorted Object at End Of List)
let worst_start_time = time::precise_time_ns();
println!("");

let mut worst_numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0];
println!("US: {:?}", worst_numbers);

bubble_sort(&mut worst_numbers);
println!("S: {:?}", worst_numbers);

let worst_end_time = time::precise_time_ns();

println!("");

println!("Time Taken (Three Sorts): {} Nanoseconds", less_end_time-less_start_time);
println!("Time Taken (Worst Case Scenario): {} Nanoseconds", worst_end_time-worst_start_time);


}


fn insertion_sort_test() {
  let less_start_time = time::precise_time_ns();  // Start Time
  println!("");

  // Sort integers
  let mut numbers = [80, 32, 19, 56, -15, 1, -1, 0, 782, 1];
  println!("US: {:?}", numbers);

  insertion_sort(&mut numbers);
  println!("S: {:?}", numbers);

  // Sort strings
  println!("");
  let mut strings = ["Hulk", "Captain America", "Black Widow", "Iron Man", "Thor", "Hawkeye"];
  println!("US: {:?}", strings);

  insertion_sort(&mut strings);
  println!("S: {:?}", strings);

  //sort Characterss
  println!("");
  let mut chars = ["b", "A", "h", "Z", "Q", "q"];
  println!("US: {:?}", chars);

  insertion_sort(&mut chars);
  println!("S: {:?}", chars);

  let less_end_time = time::precise_time_ns(); // End timer


  //Testing Worst Case Scenario (Reverse Sorted)
  let worst_start_time = time::precise_time_ns();
  println!("");

  let mut worst_numbers = [9, 8, 7, 6, 5, 4, 3, 2, 1, 0];
  println!("US: {:?}", worst_numbers);

  insertion_sort(&mut worst_numbers);
  println!("S: {:?}", worst_numbers);

  let worst_end_time = time::precise_time_ns();
  println!("");

  println!("Time Taken (Three Sorts): {} Nanoseconds", less_end_time-less_start_time);
  println!("Time Taken (Worst Case Scenario): {} Nanoseconds", worst_end_time-worst_start_time);
}

fn insertion_sort<T: std::cmp::Ord>(items: &mut [T]) {
    for i in 1..items.len() {
        let mut j = i;
        while j > 0 && items[j] < items[j-1] {
            items.swap(j, j-1);
            j = j-1;
        }
    }
}

fn quick_sort_test() {
  let less_start_time = time::precise_time_ns();

  // Sort numbers
  println!("");
  let mut numbers = [80, 32, 19, 56, -15, 1, -1, 0, 782, 1];
  println!("US: {:?}", numbers);

  quick_sort(&mut numbers, &is_more);
  println!("S: {:?}", numbers);

  // Sort strings
  println!("");
  let mut strings = ["Hulk", "Captain America", "Black Widow", "Iron Man", "Thor", "Hawkeye"];
  println!("US: {:?}", strings);

  quick_sort(&mut strings, &is_less);
  println!("S: {:?}", strings);

  //sort chars
  println!("");
  let mut chars = ["b", "A", "h", "Z", "Q", "q"];
  println!("US: {:?}", chars);

  quick_sort(&mut chars, &is_less);
  println!("S: {:?}", chars);

  let less_end_time = time::precise_time_ns();


  // Testing Worst Case Scenario (One Unsorted Object at End Of List)
  let worst_start_time = time::precise_time_ns();
  println!("");

  let mut worst_numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0];
  println!("US: {:?}", worst_numbers);

  quick_sort(&mut worst_numbers, &is_less);
  println!("S: {:?}", worst_numbers);

  let worst_end_time = time::precise_time_ns();
  println!("");

  println!("Time Taken (Three Sorts): {} Nanoseconds", less_end_time-less_start_time);
  println!("Time Taken (Worst Case Scenario): {} Nanoseconds", worst_end_time-worst_start_time);
}


// Two ways to sort (Bigger or Smaller)
#[inline(always)]
fn is_less<T: Ord>(x: &T, y: &T) -> bool {
    x < y
}

fn is_more<T: Ord>(x: &T, y: &T) -> bool {
    x > y
}

// Quick Sort Function
fn quick_sort<T>(group: &mut [T], function: &OrderFunc<T>) {
    let len = group.len();
    if len < 2 {
        return;
    }

    let pivot_index = partition(group, function);

    // Sort the left side
    quick_sort(&mut group[0..pivot_index], function); // Recurrion on left half

    // Sort the right side
    quick_sort(&mut group[pivot_index + 1..len], function); // Recursion on right half
}

fn partition<T>(group: &mut [T], function: &OrderFunc<T>) -> usize {
    let len = group.len();
    let pivot_index = len / 2;

    group.swap(pivot_index, len - 1);

    let mut store_index = 0;
    for i in 0..len - 1 {
        if function(&group[i], &group[len - 1]) {
            group.swap(i, store_index);
            store_index += 1;
        }
    }

    group.swap(store_index, len - 1);
    store_index
}

//Guessing Game (Rust Tutorial)
fn guessing_game() {
  println!("Guess the number!");

  let secret_number = rand::thread_rng().gen_range(1, 101); // Create secret number

loop {
      println!("Please input your guess.");

      let mut guess = String::new();

      io::stdin().read_line(&mut guess).expect("failed to read line");

        let guess: u32 = match guess.trim().parse() {
          Ok(num) => num,                               // Read in guess
          Err(_) => continue,
        };

      println!("You guessed: {}", guess);

      match guess.cmp(&secret_number) {
          Ordering::Less    => println!("Too small!"),
          Ordering::Greater => println!("Too big!"),
          Ordering::Equal   => {
              println!("You win!");
              break;
            }
        }
    }
}

// Used to pause the prgram until the user presses Enter
fn cont () {
  println!("");
  println!("Press Enter To Continue");

  let mut cont = String::new();

  io::stdin().read_line(&mut cont).expect("failed to read line");
}
