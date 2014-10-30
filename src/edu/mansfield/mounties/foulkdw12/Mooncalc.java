package edu.mansfield.mounties.foulkdw12;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Mooncalc extends Activity {
	
		ImageView imageOutput;
		private int elongation = 0;
		private String appearance;
		private int convertedAppear = 0;
		private Button close_Button;
		public void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.mooncalc);
			Button b = (Button) findViewById(R.id.btnResults);
	        this.close_Button = (Button)this.findViewById(R.id.exit);
     	    this.close_Button.setOnClickListener(new OnClickListener() {
     	     @Override
     	     public void onClick(View v) {
     	        finish();
     	       System.exit(0);
     	     }
     	  });

		    final RadioButton Eastern = (RadioButton) findViewById(R.id.east);
		    final RadioButton Western = (RadioButton) findViewById(R.id.west);
		    final RadioButton FullM = (RadioButton) findViewById(R.id.FullMoon);
		    final RadioButton NewM = (RadioButton) findViewById(R.id.NewMoon);
		    final EditText theAppearance = (EditText) findViewById(R.id.editAppearance);
		    final EditText theElongation = (EditText) findViewById(R.id.editElongation);
		    //final TextView theResults = (TextView) findViewById(R.id.textResults);

		    imageOutput = (ImageView) findViewById(R.id.imgResults);
		    
	    
	        b.setOnClickListener(new OnClickListener(){
	        	
	        	public void onClick(View v){
	    		    elongation =Integer.parseInt(theElongation.getText().toString());
	    		    appearance = theAppearance.getText().toString();
	    		    if(appearance.equalsIgnoreCase("rising")){
	    		    	convertedAppear = 1;
	    		    }
	    		    else if(appearance.equalsIgnoreCase("ineast")){
	    		    	convertedAppear = 2;

	    		    }
	    		    else if(appearance.equalsIgnoreCase("highsky")){
	    		    	convertedAppear = 3;

	    		    }
	    		    else if(appearance.equalsIgnoreCase("inwest")){
	    		    	convertedAppear = 4;

	    		    }
	    		    else if(appearance.equalsIgnoreCase("setting")){
	    		    	convertedAppear = 5;

	    		    }
	    		    
	    		    else if(appearance.equalsIgnoreCase("lowwest")){
	    		    	convertedAppear = 6;

	    		    }
	    		    else if(appearance.equalsIgnoreCase("lowsky")){
	    		    	convertedAppear = 7;

	    		    }else{
	    		    	convertedAppear = 8;

	    		    }
	    		    
	    		    
	        		if(Eastern.isChecked()){
	        			if(elongation == 45){
	        				switch(convertedAppear){
	        	 			case 1 : imageOutput.setImageResource(R.drawable.waxingcrest45rising);
	     		 			break;
	     				 	case 2: imageOutput.setImageResource(R.drawable.waxingcrest45ineast);
	        				break;
	        				case 3 : imageOutput.setImageResource(R.drawable.waxingcrest45highsky);
	        				break;
	        				case 4 : imageOutput.setImageResource(R.drawable.waxingcrest45inwest);
	        				break;
	        				case 5 : imageOutput.setImageResource(R.drawable.waxingcrest45setting);
	        				break;
	        				case 6 : imageOutput.setImageResource(R.drawable.waxingcrest45lowwest);
	        				break;
	        				case 7 : imageOutput.setImageResource(R.drawable.waxingcrest45lowsky);
	        				break;
	        				case 8 : imageOutput.setImageResource(R.drawable.waxingcrest45loweast);
	        				break;
	        				 		
	        				}
	        			
	        			}
	        			else if(elongation == 90){
	        				switch(convertedAppear){
				 			case 1 : imageOutput.setImageResource(R.drawable.firstquarter90rising);
				 			break;
				 			case 2 : imageOutput.setImageResource(R.drawable.firstquarter90ineast);
				 			break;
				 			case 3 : imageOutput.setImageResource(R.drawable.firstquarter90highsky);
				 			break;
				 			case 4 : imageOutput.setImageResource(R.drawable.firstquarter90inwest);
				 			break;
				 			case 5 : imageOutput.setImageResource(R.drawable.firstquarter90setting);
				 			break;
				 			case 6 : imageOutput.setImageResource(R.drawable.firstquarter90lowwest);
				 			break;
				 			case 7 : imageOutput.setImageResource(R.drawable.firstquarter90lowsky);
				 			break;
				 			case 8 : imageOutput.setImageResource(R.drawable.firstquarter90loweast);
				 			break;
				 		
	        				}
	        				
	        			}
	        			else if(elongation == 135){
	        				switch(convertedAppear){
	        	 			case 1 : imageOutput.setImageResource(R.drawable.waxinggibbous135rising);
	     		 			break;
	     				 	case 2 : imageOutput.setImageResource(R.drawable.waxinggibbous135ineast);
	        				break;
	     				 	case 3 : imageOutput.setImageResource(R.drawable.waxinggibbous135highsky);
	        				break;
	        				case 4 : imageOutput.setImageResource(R.drawable.waxinggibbous135inwest);
	        				break;
	        				case 5 : imageOutput.setImageResource(R.drawable.waxinggibbous135setting);
	        				break;
	        				case 6 : imageOutput.setImageResource(R.drawable.waxinggibbous135lowwest);
	        				break;
	        				case 7 : imageOutput.setImageResource(R.drawable.waxinggibbous135lowsky);
	        				break;
	        				case 8 : imageOutput.setImageResource(R.drawable.waxinggibbous135loweast);
	        				break;
	        				 		
	        				}
	        			}
	        		}
	        		else if(Western.isChecked()){
	        			if(elongation == 45){
	        				switch(convertedAppear){
	        	 			case 1 : imageOutput.setImageResource(R.drawable.wanningcrest45rising);
	     		 			break;
	     				 	case 2 : imageOutput.setImageResource(R.drawable.wanningcrest45ineast);
	        				break;
	        				case 3 : imageOutput.setImageResource(R.drawable.wanningcrest45highsky);
	        				break;
	        				case 4 : imageOutput.setImageResource(R.drawable.wanningcrest45inwest);
	        				break;
	        				case 5 : imageOutput.setImageResource(R.drawable.wanningcrest45setting);
	        				break;
	        				case 6 : imageOutput.setImageResource(R.drawable.wanningcrest45lowwest);
	        				break;
	        				case 7 : imageOutput.setImageResource(R.drawable.wanningcrest45lowsky);
	        				break;
	        				case 8 : imageOutput.setImageResource(R.drawable.wanningcrest45loweast);
	        				break;
	        				}
	        			}
	        			else if(elongation == 90){
	        				switch(convertedAppear){
	        	 			case 1 : imageOutput.setImageResource(R.drawable.thirdquarter90rising);
	     		 			break;
	     				 	case 2 : imageOutput.setImageResource(R.drawable.thirdquarter90ineast);
	        				break;
	        				case 3 : imageOutput.setImageResource(R.drawable.thirdquarter90highsky);
	        				break;
	        				case 4 : imageOutput.setImageResource(R.drawable.thirdquarter90inwest);
	        				break;
	        				case 5 : imageOutput.setImageResource(R.drawable.thirdquarter90setting);
	        				break;
	        				case 6 : imageOutput.setImageResource(R.drawable.thirdquarter90lowwest);
	        				break;
	        				case 7 : imageOutput.setImageResource(R.drawable.thirdquarter90lowsky);
	        				break;
	        				case 8 : imageOutput.setImageResource(R.drawable.thirdquarter90loweast);
	        				break;
	        				}
	        			}
	        			else if(elongation == 135){
	        				switch(convertedAppear){
	        	 			case 1 : imageOutput.setImageResource(R.drawable.wanninggibbous135rising);
	     		 			break;
	     				 	case 2 : imageOutput.setImageResource(R.drawable.wanninggibbous135ineast);
	        				break;
	        				case 3 : imageOutput.setImageResource(R.drawable.wanninggibbous135highsky);
	        				break;
	        				case 4 : imageOutput.setImageResource(R.drawable.wanninggibbous135inwest);
	        				break;
	        				case 5 : imageOutput.setImageResource(R.drawable.wanninggibbous135setting);
	        				break;
	        				case 6 : imageOutput.setImageResource(R.drawable.wanninggibbous135lowwest);
	        				break;
	        				case 7 : imageOutput.setImageResource(R.drawable.wanninggibbous135lowsky);
	        				break;
	        				case 8 : imageOutput.setImageResource(R.drawable.wanninggibbous135loweast);
	        				break;
	        				}
	        			}
	        			
	        			
	        		}
	        		else if(NewM.isChecked()){
	        			if(elongation == 0){
	        				switch(convertedAppear){
	        	 			case 1 : imageOutput.setImageResource(R.drawable.newmoon0rising);
	     		 			break;
	     				 	case 2 : imageOutput.setImageResource(R.drawable.newmoon0ineast);
	        				break;
	        				case 3 : imageOutput.setImageResource(R.drawable.newmoon0highsky);
	        				break;
	        				case 4 : imageOutput.setImageResource(R.drawable.newmoon0inwest);
	        				break;
	        				case 5 : imageOutput.setImageResource(R.drawable.newmoon0setting);
	        				break;
	        				case 6 : imageOutput.setImageResource(R.drawable.newmoon0lowwest);
	        				break;
	        				case 7 : imageOutput.setImageResource(R.drawable.newmoon0lowsky);
	        				break;
	        				case 8 : imageOutput.setImageResource(R.drawable.newmoon0loweast);
	        				break;
	        				}
	        			}
	        		}
	        			
	        		else if(FullM.isChecked()){
	        			if(elongation == 180){
	        				switch(convertedAppear){
	        	 			case 1 : imageOutput.setImageResource(R.drawable.fullmoon180rising);
	     		 			break;
	     				 	case 2 : imageOutput.setImageResource(R.drawable.fullmoon180ineast);
	        				break;
	        				case 3 : imageOutput.setImageResource(R.drawable.fullmoon180highsky);
	        				break;
	        				case 4 : imageOutput.setImageResource(R.drawable.fullmoon180inwest);
	        				break;
	        				case 5 : imageOutput.setImageResource(R.drawable.fullmoon180setting);
	        				break;
	        				case 6 : imageOutput.setImageResource(R.drawable.fullmoon180lowwest);
	        				break;
	        				case 7 : imageOutput.setImageResource(R.drawable.fullmoon180lowsky);
	        				break;
	        				case 8 : imageOutput.setImageResource(R.drawable.fullmoon180loweast);
	        				break;
	        				}
	        			}
	        		}
	        
	        	}
	    
	    	});
	       
	   }
}	        			
	        			