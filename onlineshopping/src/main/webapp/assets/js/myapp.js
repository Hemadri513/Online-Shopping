
$(function() {
	
	switch(menu) {

	case 'About Us':
		$('#about').addClass('active');
		break;
		
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
		
	default:
		if(menu == "Home") break;
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}

	
	//code for jquery datatable
	//create a dataset
	
	var products = [
		
		['1','ABC'],
		['2','Cde'],
		['3','FGH'],
		['4','IJK'],
		['5','LMN'],
		['6','OPQ'],
		['7','RST'],
		['8','UVW'],
		['9','XYZ'],
		['10','AYX'],
		['11','BBC'],
		['12','CBC'],
		['13','HBC']
		
		
	];
	
	
	var $table= $('#productListTable');
	
	
	//execute the below code only where we have this table
	
	if($table.length)
		{
		//console.log('Inside the table');
		
		$table.DataTable( {
			
			lengthMenu: [ [3,5,10,-1],['3 Records','5 Records','10 Records','All Records']],
			pageLength:5,
			data: products
		});
		
		}
	
	
	
	
	
	
	
		
});