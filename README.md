# Data-Binding-androi-exmple

## 1. Data Binding With TextViews
      The Data Binding Library is a support library that allows 
      you to bind UI components in your layouts to data sources in your app
      using a declarative format rather than programmatically.

      Layouts are often defined in activities with code that calls UI framework methods.
      For example, the code below calls findViewById()
      to find a TextView widget and bind it to the userName property of the viewModel variable

## 2. Data Binding For Event Listeners
      n previous articles, I wrote about how to eliminate findViewById from
      Android applications and in some cases eliminate the need for View IDs altogether. 
      One thing I didn’t explicitly mention in those articles is how to handle event listeners,
      such as View’s OnClickListener and TextView’s TextWatcher.
      
      Android Data Binding provides three mechanisms to set an event listener
      in the layout file and you can choose whichever is most convenient for you.
      Unlike the standard Android onClick attribute,
      none of the event data binding mechanisms use reflection, so performance
      is good whichever mechanism you choose.

## 3. Work With Include Layouts
      In my earlier posts we have done some basics with data binding like using Recycler view,
      custom binding adapters/attributes etc. Now we will look into some simpler
      but much useful things in data binding its imports
      and includes. Most of us have used another layout in our current layout in android using includes,
      so how will we bind our data with those includes as well. This problem will be 
      solved in includes in data binding.

      Also data binding’s main advantage/ purpose is that we don’t have to play with views in our code 
      or we can say java file but in many cases our view will require more things then only data. 
      This will be included in imports in data binding.

## 4. Two Way Data Binding
      A quick way to achieve two-way Data Binding works in the same way as regular, 
      “one-way” Data Binding. You probably wouldn’t want to use this in your app (as you’ll see later on), 
      but instead as an intermediate step towards achieving 
      your first two-way Data Binding setup. Consider that you’re making
      a password creation screen, and you want to show a password strength indicator as they type.
