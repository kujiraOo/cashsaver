# cashsaver

cs is an android app to help you track how you spend your money 

### functionality:
- see how much you spend statistics
- you can set weekly or monthly limit for spending money, daily limit will be calculated 		automatically
- has desktop widget so you can enter info about your last purchase easily
- has categories for purchases, so you can keep track on what you spend your money
- saves data only locally

# TODO

### main activity:

- each entry of the list shows some time info about time period and if you exceeded the limit in that period spent/limit
- tap entry to see detailed info of that entry
- can add tag message to every purchase

##### main view
- shows all days days and how much you have spent during each day in each category
- there is a week separator that shows the same info for the whole week
- there is a week separator that shows the same info for the whole month
- [weeks, months view]
	
	

### desktop widget
when current period has come to an end app asks to set new limit for new period
- select month or week
- select money limit
	- previous +- bonus/overrun
	- previous
	- new

- info spent/limit
- text field for the sum of the purchase
- 5 last catergories
- scroll widget for categories
- optional short tag message

### data to store

- purchase {sum, category, tagmessage}
- limits {period, sum}

### graphics
	
##### categories icons
- food
- restaurant
- coffee
- alco
- cigarettes
- car fuel
- entertainment
- clothes