
public class rajamantri extends ACTIVITY
{
    @Override
 	public void onBackPressed()
    {
    }
    @Override
  	protected void onPostResume()
    {
	// TODO Auto-generated method stub
	super.onPostResume();
    }
    
    @Override
	public boolean oneKeyDown(int keyCode, KeyEvent event)
    {
	AlertDialog dialog = new AlertDialog.Builder(this).create();
	dialog.setTitle("Exit game!");
	dialog.setMessage("Are you sure you want to exit the game?");
	dialog.setButton("Exit", new DialogInterface.OnClickListener()
	    {
		public void onClick(DialogInterface dialog, int which) 
		{
		    finish();
		}
	    });
	dialog.setButton2("Cancel", new DialogInterface.OnClickListener() {
		public void onClick(DialogInterface dialog, int which) {
		    dialog.dismiss();
		}
	    });
	dialog.show();
	return super.onKeyDown(keyCode, event);
    }
    
    @Override
    //Method for generating message after low memory
	public void generateLowMemoryMessage() {
	AlertDialog dialog = new AlertDialog.Builder(this).create();
	dialog.setTitle("Low memory!");
	dialog.setMessage("Too many apps open, kindly close some other apps and try again!");
	dialog.setButton("Exit", new DialogInterface.OnClickListener() {
		
		public void onClick(DialogInterface dialog, int which) {
		    
		    finish();
		    
		}
	    });
	
	dialog.show();
	
	
	super.onLowMemory();
    }
    
    @Override
    //method for pause 
	protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
    }
    
    String[] solutionArray = { "raja", "mantri", "chor", "sipahi"};
    String[] playersArray = {"NorthPlayer", "westPlayer", "southPlayer", "eastPlayer"};
    //varibales for player names	
    static String northPlayerName = "" ;
    static String westPlayerName = "";
    static String southPlayerName = "";
    static String eastPlayerName = "";
    
    //role of player	
    static String playerOneRole = "";
    static String player2_role = "";
    static String player3_role = "";
    static String player4_role = "";
    
    static boolean guess = false;
    
    static String player1 = "";
    static String player2 = "";
    static String player3 = "";
    static String player4 = "";
    
    static int i=0,j=0,k=0,l=0;
    static int playerOneScore = 0;
    static int playerTwoScore = 0;
    static int playerThreeScore = 0;
    static int playerFourScore = 0;
    int count = 0;
    
    Button btnRajaMantri;
    Button btnHelp;
    ImageView btn9;
    Button buttonForPlay;
    //static Button btnPod1;
    //static Button btnPod2;
    //static Button btnPod3;
    //static Button btnPod4;
    Button btnShowResult;
    Button btnRestart;
    Button btnSignin;
    Button btnGuess;
    EditText editTxtPlayer1;
    EditText editTxtPlayer2;
    EditText editTxtPlayer3;
    EditText editTxtPlayer4;
    //EditText edt2;
    //EditText edt3;
    //EditText edt4;
    
    TextView lblPlayer1;
    TextView lblPlayer2;
    TextView lblPlayer3;
    TextView lblPlayer4;
    static TextView txtTurn;
    static TextView txtPlayer1;
    static TextView txtPlayer2;
    static TextView txtPlayer3;
    static TextView txtPlayer4;
    Bundle savedInstanceState2;
    Button btnMainMenu;
    
    String nextTurn = "";
    
	//Method for restart
    public void onRestart(){
	
    	super.onRestart();
	/*	northPlayerName = "" ;
		westPlayerName = "";
		southPlayerName = "";
		eastPlayerName = "";
		guess = false;
		player1 = "";
		player2 = "";
		player3 = "";
		player4 = "";
		i=0;j=0;k=0;l=0;
		playerOneScore = 0;
		playerTwoScore = 0;
		playerThreeScore = 0;
		playerFourScore = 0;*/
    	
    	
    }
    
    public void onResume(){
	
    	super.onResume();
    	/*northPlayerName = "" ;
	  westPlayerName = "";
	  southPlayerName = "";
	  eastPlayerName = "";
	  guess = false;
	  player1 = "";
	  player2 = "";
	  player3 = "";
	  player4 = "";
	  i=0;j=0;k=0;l=0;
	  playerOneScore = 0;
	  playerTwoScore = 0;
	  playerThreeScore = 0;
	  playerFourScore = 0;*/
    	
    	
    }
    
    
    

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
	
        i=0;
        j=0;
        k=0;
        l=0;
        btnHelp = (Button)findViewById(R.id.btnHelp);
        btnHelp.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
		    setContentView(R.layout.help);
		    // Create the adView
		    AdView adView = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
		    // Lookup your LinearLayout assuming it’s been given
		    // the attribute android:id="@+id/mainLayout"
		    LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayoutHelp);
		    // Add the adView to it
		    layout.addView(adView);
		    // Initiate a generic request to load it with an ad
		    adView.loadAd(new AdRequest());
		    TextView txtHelp = (TextView)findViewById(R.id.txtHelp);
		    String text = "Welcome to nostalgia! This is the paper free version of Raja Mantri Chor Sipahi.\n\nThe game involves bluffing with facial expressions and good guessing. This is a very popular childhood game in India played among kids often during their long summer vacations.\n\nThe game has 4 paper chits with Chor (thief), Sipahi (police), Raja (king) and Mantri (minister). The chits are folded at the start of the game and one of the 4 players will press SHUFFLE each one of the four players is supposed to secretly (by taking the phone and not letting the others see it)pick one chit by clicking on it, the player then clicks on the chit again to fold it back. All the players will then secretly open their chits and read what they have got. \n\nThe player who gets the chit with Raja written on it will say MERA mantri KAUN? (Who is my minister?). The player who got the chit with Mantri will say MEIN! (Me), The player with Raja will then say chor sipahi KA PATA LAGAO (find out who is the theif and who is the soldier). The player with Mantri will then guess who is the Chor (Thief), if he is wrong then his points are deducted and if he is correct he gets more points and the points from the player who got Chor (Thief) are deducted.\n\nIf the guess is correct the player with Chor is wrapped on his wrist by the Mantri, and if the Mantri is wrong then the Chor gets to hit his wrist.";
		    txtHelp.setText(text);
		    Button btnBack = (Button)findViewById(R.id.btnMainMenuHelp);
		    btnBack.setOnClickListener(new OnClickListener() {
			    
			    public void onClick(View v) {
				
				Intent i = new Intent(RajaMantri.this, RajaMantri.class);
				RajaMantri.this.startActivity(i);
				finish();
				
			    }
			});
		}
	    });
        btnRajaMantri = (Button) findViewById(R.id.btnRajaMantri);
        btnRajaMantri.setOnClickListener(new OnClickListener() {
		
 		public void onClick(View v) {
		    // TODO Auto-generated method stub
		    setContentView(R.layout.rmcsp);	
		    // Create the adView
		    AdView adView = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
		    // Lookup your LinearLayout assuming it’s been given
		    // the attribute android:id="@+id/mainLayout"
		    LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayoutPlayer);
		    // Add the adView to it
		    layout.addView(adView);
		    // Initiate a generic request to load it with an ad
		    adView.loadAd(new AdRequest());
		    
		    editTxtPlayer1 = (EditText) findViewById(R.id.editTxtPlayer1);
		    editTxtPlayer2 = (EditText)findViewById(R.id.editTxtPlayer2);
		    editTxtPlayer3 = (EditText)findViewById(R.id.editTxtPlayer3);
		    editTxtPlayer4 = (EditText)findViewById(R.id.editTxtPlayer4);
		    
		    lblPlayer1 = (TextView) findViewById(R.id.lblPlayer1);
		    lblPlayer2 = (TextView) findViewById(R.id.lblPlayer2);
		    lblPlayer3 = (TextView) findViewById(R.id.lblPlayer3);
		    lblPlayer4 = (TextView) findViewById(R.id.lblPlayer4);
		    
		    Display display = getWindowManager().getDefaultDisplay(); 
		    int width = display.getWidth();
		    int height = display.getHeight();
		    
		    
		    
		    lblPlayer1.setGravity(Gravity.CENTER_HORIZONTAL);
		    lblPlayer2.setGravity(Gravity.CENTER_HORIZONTAL);
		    lblPlayer3.setGravity(Gravity.CENTER_HORIZONTAL);
		    lblPlayer4.setGravity(Gravity.CENTER_HORIZONTAL);
		    
		    
		    Log.v("AkandBakar", "Playernames:" + northPlayerName);
		    Log.v("AkandBakar", "Playernames:" + westPlayerName);
		    Log.v("AkandBakar", "Playernames:" + southPlayerName);
		    Log.v("AkandBakar", "Playernames:" + eastPlayerName);
		    
		    btnMainMenu = (Button) findViewById(R.id.btnMainMenu);
		    btnMainMenu.setOnClickListener(new OnClickListener() {
			    
			    
			    public void onClick(View v) {
				Intent i = new Intent(RajaMantri.this, RajaMantri.class);
				RajaMantri.this.startActivity(i);
				finish();
				
			    }
			});
		    
		    btnSignin = (Button) findViewById(R.id.btnsignin);
		    btnSignin.setOnClickListener(new OnClickListener() {
			    
			    public void onClick(View v) {
				// TODO Auto-generated method stub
				
				northPlayerName = editTxtPlayer1.getText().toString();
		 		westPlayerName = editTxtPlayer2.getText().toString();
		 		southPlayerName = editTxtPlayer3.getText().toString();
		 		eastPlayerName = editTxtPlayer4.getText().toString();
				
		 		
				if(northPlayerName.equals("")||westPlayerName.equals("")||southPlayerName.equals("")||eastPlayerName.equals("")){
				    
				    Toast toast = Toast.makeText(getBaseContext(), "Enter player names!", 8000);
				    toast.show();
				    
				}else{
				    setContentView(R.layout.rmcsgnew);	
				    // Create the adView
				    AdView adView = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
				    // Lookup your LinearLayout assuming it’s been given
				    // the attribute android:id="@+id/mainLayout"
				    LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayout);
				    // Add the adView to it
				    layout.addView(adView);
				    // Initiate a generic request to load it with an ad
				    adView.loadAd(new AdRequest());
				    
				    txtTurn = (TextView)findViewById(R.id.txtTurn);
				    txtTurn.setText("Click on SHUFFLE!");
				    playersArray[0] = northPlayerName;
				    playersArray[1] = westPlayerName;
				    playersArray[2] = southPlayerName;
				    playersArray[3] = eastPlayerName;
				    
				    
				    
				    txtPlayer1 = (TextView) findViewById(R.id.txtPlayer1);
				    txtPlayer1.setText("1."+northPlayerName + " [" + playerOneScore + "]");
				    
				    txtPlayer2 = (TextView) findViewById(R.id.txtPlayer2);
				    txtPlayer2.setText("2."+westPlayerName+ " [" + playerTwoScore + "]");
				    
				    txtPlayer3 = (TextView) findViewById(R.id.txtPlayer3);
				    txtPlayer3.setText("3."+southPlayerName+ " [" + playerThreeScore + "]");
				    
				    txtPlayer4 = (TextView) findViewById(R.id.txtPlayer4);
				    txtPlayer4.setText("4."+eastPlayerName+ " [" + playerFourScore + "]");
				    
				    buttonForPlay = (Button) findViewById(R.id.buttonForPlay);
				    
				    buttonForPlay.setOnClickListener(new OnClickListener() {
					    
					    public void onClick(View v) {
		 				// TODO Auto-generated method stub
		 				
		 				if(buttonForPlay.getText().equals("SHUFFLE")){
						    
						    RajaMantri.this.shuffle();
						    
		 				}else{
						    
						    
						    RajaMantri.this.makeGuess();
						    
						    Log.v("RajaMantri", "########## Player Name:" + northPlayerName +" Role:" + playerOneRole);
						    Log.v("RajaMantri", "########## Player Name:" + westPlayerName +" Role:" + player2_role);
						    Log.v("RajaMantri", "########## Player Name:" + southPlayerName +" Role:" + player3_role);
						    Log.v("RajaMantri", "########## Player Name:" + eastPlayerName +" Role:" + player4_role);
						}
						
		 				
					    }
					});
				    
				    
				    
				}
				
		     }
			    
		 	});
		}
		
		
	    });
 	
	
    }
    
    
    public void makeGuess(){
	
    	buttonForPlay.setText("SHUFFLE");
	count = 0;
	buttonForPlay.setText("SHUFFLE");
	
	btnPod1.setClickable(true);
	btnPod2.setClickable(true);
	btnPod3.setClickable(true);
	btnPod4.setClickable(true);
	
	if(player1.equals("raja")){
	    
	    btnPod1.setText("raja");
	    btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod1.setClickable(false);
	}
	if(player2.equals("raja")){
	    
	    btnPod2.setText("raja");
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod2.setClickable(false);
	}
	if(player3.equals("raja")){
	    
	    btnPod3.setText("raja");
	    btnPod3.setBackgroundResource(R.drawable.podopen);
	    btnPod3.setClickable(false);
	}
	if(player4.equals("raja")){
	    
	    btnPod4.setText("raja");
	    btnPod4.setBackgroundResource(R.drawable.podopen);
	    btnPod4.setClickable(false);
	}
	
	if(player1.equals("mantri")){
	    
	    btnPod1.setText("mantri");
	    btnPod1.setBackgroundResource(R.drawable.podopen);
	    btnPod1.setClickable(false);
	}
	if(player2.equals("mantri")){
	    
	    btnPod2.setText("mantri");
	    btnPod2.setBackgroundResource(R.drawable.podopen);
	    btnPod2.setClickable(false);
	}
	if(player3.equals("mantri")){
	    
	    btnPod3.setText("mantri");
	    btnPod3.setBackgroundResource(R.drawable.podopen);
	    btnPod3.setClickable(false);
	}
	if(player4.equals("mantri")){
	    
	    btnPod4.setText("mantri");
	    btnPod4.setBackgroundResource(R.drawable.podopen);
	    btnPod4.setClickable(false);
	    
	}
	
	if(playerOneRole.equals("mantri")){
	    txtTurn.setText(northPlayerName + " will find the chor!");
	}
	if(player2_role.equals("mantri")){
	    txtTurn.setText(westPlayerName + " will find the chor!");
	}
	if(player3_role.equals("mantri")){
	    txtTurn.setText(southPlayerName + " will find the chor!");
	}
	if(player4_role.equals("mantri")){
	    txtTurn.setText(eastPlayerName + " will find the chor!");
	}
	
	Log.v("AkhandBakar","#########" + btnPod1.getText());
	
	if(btnPod1.getText().equals("")){
	    
	    btnPod1.setOnClickListener(new OnClickListener() {
		    
		    
		    public void onClick(View v) {
			// TODO Auto-generated method stub
			Log.v("AkhandBakar","#########" + player1);
			if(player1.equals("chor")){
			    
			    RajaMantri.guess = true;
			    btnPod1.setBackgroundResource(R.drawable.podopen);
			    btnPod1.setText("chor");
			    
			}else{
			    
			    RajaMantri.guess = false;
						btnPod1.setBackgroundResource(R.drawable.podopen);
						btnPod1.setText("sipahi");
			}
			btnPod1.setClickable(false);
					btnPod2.setClickable(false);
					btnPod3.setClickable(false);
					btnPod4.setClickable(false);
					updateScore();
		    }
		});
	}	
		
	
	Log.v("AkhandBakar","#########" + btnPod2.getText());
	if(btnPod2.getText().equals("")){
	    
	    btnPod2.setOnClickListener(new OnClickListener() {
		    
		    public void onClick(View v) {
			// TODO Auto-generated method stub
			Log.v("AkhandBakar","#########" + player2);
			if(player2.equals("chor")){
			    
			    RajaMantri.guess = true;
			    btnPod2.setBackgroundResource(R.drawable.podopen);
			    btnPod2.setText("chor");
			}else{
			    
			    RajaMantri.guess = false;
			    btnPod2.setBackgroundResource(R.drawable.podopen);
			    btnPod2.setText("sipahi");
			    
			}
			btnPod1.setClickable(false);
			btnPod2.setClickable(false);
			btnPod3.setClickable(false);
			btnPod4.setClickable(false);
			updateScore();
		    }
			});
	}	
    	
	Log.v("AkhandBakar","#########" + btnPod3.getText());
		if(btnPod3.getText().equals("")){
		    
		    btnPod3.setOnClickListener(new OnClickListener() {
			    
				
			    public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.v("AkhandBakar","#########" + player3);
				if(player3.equals("chor")){
				    
				    RajaMantri.guess = true;
				    btnPod3.setBackgroundResource(R.drawable.podopen);
				    btnPod3.setText("chor");
					}else{
				    
				    RajaMantri.guess = false;
				    btnPod3.setBackgroundResource(R.drawable.podopen);
				    btnPod3.setText("sipahi");
				    
				}
				btnPod1.setClickable(false);
				btnPod2.setClickable(false);
				btnPod3.setClickable(false);
				btnPod4.setClickable(false);
				updateScore();
				}
			});
		}
		
		
		Log.v("AkhandBakar","#########" + btnPod4.getText());
		if(btnPod4.getText().equals("")){
		    
		    btnPod4.setOnClickListener(new OnClickListener() {
			    
			    
			    public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.v("AkhandBakar","#########" + player4);
				if(player4.equals("chor")){
					
				    RajaMantri.guess = true;
				    btnPod4.setBackgroundResource(R.drawable.podopen);
				    btnPod4.setText("chor");
				}else{
				    
				    RajaMantri.guess = false;
						btnPod4.setBackgroundResource(R.drawable.podopen);
						btnPod4.setText("sipahi");
						
					}
				btnPod1.setClickable(false);
				btnPod2.setClickable(false);
				btnPod3.setClickable(false);
				btnPod4.setClickable(false);
				updateScore();
			    }
			});
		}
		
    }
    
    
    public void shuffle(){
	
    	buttonForPlay.setText("Guess");
	buttonForPlay.setClickable(false);
	shuffleArray(solutionArray);
	txtTurn.setText(northPlayerName + "'s" + " turn!");
	nextTurn = westPlayerName;
	btnPod1 = (Button)findViewById(R.id.btnPod1);
	btnPod1.setBackgroundResource(R.drawable.podtlclosed);
	btnPod1.setOnClickListener(new OnClickListener() {
				
		public void onClick(View v) {
		    // TODO Auto-generated method stub
		    player1 = solutionArray[0];
		    btnPod1.setText(player1);
		    btnPod1.setBackgroundResource(R.drawable.podopen);
		    btnPod2.setClickable(false);
		    btnPod3.setClickable(false);
		    btnPod4.setClickable(false);
		    if(txtTurn.getText().equals(northPlayerName + "'s" + " turn!")){
			
			if(player1.equals("mantri")){
			    
			    playerOneRole = "mantri";
			}
			if(player1.equals("raja")){
			    
			    playerOneRole = "raja";
			}
			if(player1.equals("sipahi")){
			    
			    playerOneRole = "sipahi";
			}
			if(player1.equals("chor")){
			    
			    playerOneRole = "chor";
						}
			
			
			nextTurn = westPlayerName + "'s" + " turn!";
						
		    }
		    if(txtTurn.getText().equals(westPlayerName + "'s" + " turn!"))
			{
			
			    if(player1.equals("mantri"))
				{
				    
				    player2_role = "mantri";
				}
			    if(player1.equals("raja"))
				{
				
				    player2_role = "raja";
				}
			    if(player1.equals("sipahi"))
				{
				    
				    player2_role = "sipahi";
				}
			    if(player1.equals("chor"))
				{
				    
				    player2_role = "chor";
				}
			    
			    nextTurn = southPlayerName + "'s" + " turn!";
			    
			}
		    if(txtTurn.getText().equals(southPlayerName + "'s" + " turn!"))
			{
			    
			    if(player1.equals("mantri"))
				{
				    
				    player3_role = "mantri";
				}
			    if(player1.equals("raja"))
				{
				    
				    player3_role = "raja";
				}
			    if(player1.equals("sipahi"))
				{
				    
				    player3_role = "sipahi";
				}
			    if(player1.equals("chor"))
				{
				    
				    player3_role = "chor";
				}
			    
			    nextTurn = eastPlayerName + "'s" + " turn!";
			    
			}
		    
		    if(txtTurn.getText().equals(eastPlayerName + "'s" + " turn!")){
			
			if(player1.equals("mantri"))
			    {
				
				player4_role = "mantri";
			    }
			if(player1.equals("raja"))
			    {
			    
				player4_role = "raja";
			    }
			if(player1.equals("sipahi"))
			    {
				
				player4_role = "sipahi";
			    }
			if(player1.equals("chor"))
			    {
				
				player4_role = "chor";
			    }
				    	
						
			nextTurn = "Click on Guess!";
			
		    }
		    
		    txtTurn.setText("Click again to close the chit!");
		    
		    
		    
		    btnPod1.setOnClickListener(new OnClickListener() 
			{
			    
			    public void onClick(View v) 
			    {
				// TODO Auto-generated method stub
				btnPod1.setClickable(false);
				count++;
				btnPod1.setText("");
				btnPod1.setBackgroundResource(R.drawable.podtlhalf);
				txtTurn.setText(nextTurn);
				btnPod2.setClickable(true);
				btnPod3.setClickable(true);
				btnPod4.setClickable(true);
				if(count == 4){
				    
				    txtTurn.setText("Click on Guess!");
				    buttonForPlay.setClickable(true);
				    count = 0;
				    
				}
			    }
			});
		}
	    });
	
	btnPod2 = (Button)findViewById(R.id.btnPod2);
	btnPod2.setBackgroundResource(R.drawable.podtrclosed);
	btnPod2.setOnClickListener(new OnClickListener() 
	    {
		
		public void onClick(View v) 
		{
		    // TODO Auto-generated method stub
		    player2 = solutionArray[1];
		    btnPod2.setText(player2);
		    btnPod2.setBackgroundResource(R.drawable.podopen);
		    btnPod1.setClickable(false);
		    btnPod3.setClickable(false);
		    btnPod4.setClickable(false);
		    if(txtTurn.getText().equals(northPlayerName + "'s" + " turn!"))
			{
			    
			    if(player2.equals("mantri"))
				
				    
				    playerOneRole = "mantri";
				
			    if(player2.equals("raja"))
				
				playerOneRole = "raja";
			    
			    if(player2.equals("sipahi"))

				
								playerOneRole = "sipahi";
							}
							if(player2.equals("chor")){
								
								playerOneRole = "chor";
							}
					    	
							nextTurn = westPlayerName+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(westPlayerName + "'s" + " turn!")){
							
							if(player2.equals("mantri")){
								
								player2_role = "mantri";
							}
							if(player2.equals("raja")){
								
								player2_role = "raja";
							}
							if(player2.equals("sipahi")){

								player2_role = "sipahi";
							}
							if(player2.equals("chor")){
								
								player2_role = "chor";
							}
					    	
							nextTurn = southPlayerName+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(southPlayerName + "'s" + " turn!")){
							
							if(player2.equals("mantri")){
								
								player3_role = "mantri";
							}
							if(player2.equals("raja")){
								
								player3_role = "raja";
							}
							if(player2.equals("sipahi")){

								player3_role = "sipahi";
							}
							if(player2.equals("chor")){
							    
								player3_role = "chor";
							}
					    	
							nextTurn = eastPlayerName+ "'s" + " turn!";
							
						}
		if(txtTurn.getText().equals(eastPlayerName + "'s" + " turn!")){
		    
		    if(player2.equals("mantri")){
			
			player4_role = "mantri";
		    }
							if(player2.equals("raja")){
							    
							    player4_role = "raja";
							}
							if(player2.equals("sipahi")){
							    
							    player4_role = "sipahi";
							}
							if(player2.equals("chor")){
							    
							    player4_role = "chor";
							}
							
							nextTurn = "Click on Guess!";
							
		}
		txtTurn.setText("Click again to close the chit!");
		btnPod2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
			    // TODO Auto-generated method stub
								btnPod2.setClickable(false);
								count++;
								btnPod2.setText("");
								btnPod2.setBackgroundResource(R.drawable.podtrhalf);
								txtTurn.setText(nextTurn);
								btnPod1.setClickable(true);
								btnPod3.setClickable(true);
								btnPod4.setClickable(true);
								if(count == 4){
								    
								    txtTurn.setText("Click on Guess!");
								    buttonForPlay.setClickable(true);
								    count = 0;
								    
								}
			}
		    });
	    }
	    });
    
    
    btnPod3 = (Button)findViewById(R.id.btnPod3);
    btnPod3.setBackgroundResource(R.drawable.podblclosed);
    btnPod3.setOnClickListener(new OnClickListener() {
	    
	    public void onClick(View v) {
		// TODO Auto-generated method stub
		player3 = solutionArray[2];
		btnPod3.setText(player3);
		btnPod3.setBackgroundResource(R.drawable.podopen);
		
		btnPod2.setClickable(false);
		btnPod1.setClickable(false);
		btnPod4.setClickable(false);
		if(txtTurn.getText().equals(northPlayerName + "'s" + " turn!")){
		    
		    if(player3.equals("mantri")){
			
			playerOneRole = "mantri";
		    }
		    if(player3.equals("raja")){
			
			playerOneRole = "raja";
		    }
		    if(player3.equals("sipahi")){
			
			playerOneRole = "sipahi";
		    }
		    if(player3.equals("chor")){
			
			playerOneRole = "chor";
		    }
		    
		    nextTurn = westPlayerName+ "'s" + " turn!";
		    
		}
		if(txtTurn.getText().equals(westPlayerName + "'s" + " turn!")){
		    
		    if(player3.equals("mantri")){
			
			player2_role = "mantri";
		    }
		    if(player3.equals("raja")){
			
			player2_role = "raja";
		    }
		    if(player3.equals("sipahi")){
			
			player2_role = "sipahi";
		    }
		    if(player3.equals("chor")){
			
			player2_role = "chor";
		    }
		    
		    nextTurn = southPlayerName+ "'s" + " turn!";
		    
		}
		if(txtTurn.getText().equals(southPlayerName + "'s" + " turn!")){
		    
		    if(player3.equals("mantri")){
			
			player3_role = "mantri";
		    }
							if(player3.equals("raja")){
							    
							    player3_role = "raja";
							}
							if(player3.equals("sipahi")){

							    player3_role = "sipahi";
							}
							if(player3.equals("chor")){
							    
							    player3_role = "chor";
							}
							nextTurn = eastPlayerName+ "'s" + " turn!";
							
		}
		if(txtTurn.getText().equals(eastPlayerName + "'s" + " turn!")){
		    
		    if(player3.equals("mantri")){
			
			player4_role = "mantri";
		    }
							if(player3.equals("raja")){
							    
							    player4_role = "raja";
							}
							if(player3.equals("sipahi")){
							    
							    player4_role = "sipahi";
							}
							if(player3.equals("chor")){
							    
							    player4_role = "chor";
							}
							nextTurn = "Click on Guess!";
							
		}
		
		txtTurn.setText("Click again to close the chit!");
		btnPod3.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
			    // TODO Auto-generated method stub
			    btnPod3.setClickable(false);
			    count++;
			    btnPod3.setText("");
			    btnPod3.setBackgroundResource(R.drawable.podblhalf);
			    txtTurn.setText(nextTurn);
			    btnPod2.setClickable(true);
			    btnPod1.setClickable(true);
			    btnPod4.setClickable(true);
			    if(count == 4){
				
				txtTurn.setText("Click on Guess!");
				buttonForPlay.setClickable(true);
				count = 0;
				
			    }
			}
		    });
	    }
	});
    
    
    
			
    btnPod4 = (Button)findViewById(R.id.btnPod4);
    btnPod4.setBackgroundResource(R.drawable.podbrclosed);
    
    btnPod4.setOnClickListener(new OnClickListener() {
	    
	    public void onClick(View v) {
		// TODO Auto-generated method stub
						player4 = solutionArray[3];
						btnPod4.setText(player4);
						btnPod4.setBackgroundResource(R.drawable.podopen);
						
						
						btnPod2.setClickable(false);
						btnPod3.setClickable(false);
						btnPod1.setClickable(false);
						if(txtTurn.getText().equals(northPlayerName + "'s" + " turn!")){
						    
						    if(player4.equals("mantri")){
							
							playerOneRole = "mantri";
						    }
						    if(player4.equals("raja")){
							
							playerOneRole = "raja";
						    }
						    if(player4.equals("sipahi")){
							
							playerOneRole = "sipahi";
						    }
						    if(player4.equals("chor")){
							
							playerOneRole = "chor";
						    }
						    nextTurn = westPlayerName+ "'s" + " turn!";
						    
						}
						if(txtTurn.getText().equals(westPlayerName + "'s" + " turn!")){
							
						    if(player4.equals("mantri")){
							
							player2_role = "mantri";
							}
						    if(player4.equals("raja")){
							
							player2_role = "raja";
						    }
						    if(player4.equals("sipahi")){
							
							player2_role = "sipahi";
						    }
						    if(player4.equals("chor")){
							
							player2_role = "chor";
							}
						    nextTurn = southPlayerName+ "'s" + " turn!";
						    
						}
						if(txtTurn.getText().equals(southPlayerName + "'s" + " turn!")){
						    
						    if(player4.equals("mantri")){
							
							player3_role = "mantri";
						    }
						    if(player4.equals("raja")){
							
							player3_role = "raja";
						    }
							if(player4.equals("sipahi")){
							    
							    player3_role = "sipahi";
							}
							if(player4.equals("chor")){
							    
								player3_role = "chor";
							}
							nextTurn = eastPlayerName+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(eastPlayerName + "'s" + " turn!")){
						    
						    if(player4.equals("mantri")){
							
								player4_role = "mantri";
						    }
						    if(player4.equals("raja")){
								
							player4_role = "raja";
						    }
						    if(player4.equals("sipahi")){

							player4_role = "sipahi";
						    }
						    if(player4.equals("chor")){
								
							player4_role = "chor";
						    }
						    nextTurn = "Click on Guess!";
						    
						}
						
						txtTurn.setText("Click again to close the chit!");
						btnPod4.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
							    // TODO Auto-generated method stub
							    btnPod4.setClickable(false);
							    count++;
							    btnPod4.setText("");
							    btnPod4.setBackgroundResource(R.drawable.podbrhalf);
							    txtTurn.setText(nextTurn);
							    btnPod2.setClickable(true);
							    btnPod3.setClickable(true);
							    btnPod1.setClickable(true);
							    if(count == 4){
								
								txtTurn.setText(nextTurn);
								buttonForPlay.setClickable(true);
								count = 0;
								
								}
							}
						    });
	    }
	});    
			
    btnPod1.setText("");
    btnPod2.setText("");
    btnPod3.setText("");
    btnPod4.setText("");
    
    	
}

public void setRole(String role, String player){
    
    if(player1.equals("mantri")){
	
	player4_role = "mantri";
    }
    if(player1.equals("raja")){
			
	player4_role = "raja";
    }
    if(player1.equals("sipahi")){
	
	player4_role = "sipahi";
    }
		if(player1.equals("chor")){
		    
		    player4_role = "chor";
		}
		
		
} 
    
void shuffleArray(String[] solutionArray)
{
    Random rnd = new Random();
    for (int i = solutionArray.length - 1; i >= 0; i--)
	{
    			int index = rnd.nextInt(i + 1);
			
    			String a = solutionArray[index];
    			solutionArray[index] = solutionArray[i];
    			solutionArray[i] = a;
	}
	}

static void updateScore(){
    
    Log.v("AkhandBakar", "##########"+ guess);
    if(playerOneRole.equals("mantri"))
    	{
	    Log.v("AkhandBakar", "##########Mantri"+ northPlayerName);
	    if(guess)
    		{
    		i = i+80;
    		playerOneScore=i;
    		txtTurn.setText(northPlayerName+" is right!");
    		btnPod1.setText(player1);
		btnPod2.setText(player2);
		btnPod3.setText(player3);
		btnPod4.setText(player4);
		btnPod1.setBackgroundResource(R.drawable.podopen);
		btnPod2.setBackgroundResource(R.drawable.podopen);
		btnPod3.setBackgroundResource(R.drawable.podopen);
		btnPod4.setBackgroundResource(R.drawable.podopen);
    		if(player2_role.equals("chor"))
		    {
    			playerTwoScore=j;
    			if(player3_role.equals("raja")){
			    
			    k = k+100;
			    l = l+50;
    				playerThreeScore=k;
    				playerFourScore=l;
    			}else{
			    
			    l = l+100;
			    k = k+50;
			    playerFourScore=l;
    				playerThreeScore=k;
    			}
		    }
    		if(player3_role.equals("chor"))
		    {
			
    			playerThreeScore=k;
    			
    			
    			if(player2_role.equals("raja")){
			    
    				j = j+100;
    				l = l+50;
    				playerTwoScore=j;
    				playerFourScore=l;
    			}else{
			    
			    l = l+100;
			    j = j+50;
			    playerFourScore=l;
			    playerTwoScore=j;
    			}
		    }
    		if(player4_role.equals("chor"))
		    {
			
    			playerFourScore=l;
    			
    			if(player3_role.equals("raja")){
			    
			    k = k+100;
    				j = j+50;
    				playerTwoScore=j;
    				playerThreeScore=k;
    			}else{
			    
			    j = j+100;
			    k = k+50;
    				playerThreeScore=k;
    				playerTwoScore=j;
    			}
		    }
    		}
	    else
    		{
		    i=i-80;
		    playerOneScore = i;
		    txtTurn.setText(northPlayerName+" is wrong!");
		    btnPod1.setText(player1);
		    btnPod2.setText(player2);
		    btnPod3.setText(player3);
		    btnPod4.setText(player4);
		    btnPod1.setBackgroundResource(R.drawable.podopen);
		    btnPod2.setBackgroundResource(R.drawable.podopen);
		    btnPod3.setBackgroundResource(R.drawable.podopen);
		    btnPod4.setBackgroundResource(R.drawable.podopen);
		    if(player2_role.equals("chor"))
			{
			    j = j+25;
			    playerTwoScore=j;
			    if(player3_role.equals("raja")){
				
				k = k+100;
				l = l+50;
				playerThreeScore=k;
				playerFourScore=l;
			    }else{
				
				l = l+100;
				k = k+50;
				playerFourScore=l;
				playerThreeScore=k;
			    }
			}
		    if(player3_role.equals("chor"))
			{
			    k=k+25;
			    playerThreeScore=k;
			    
			    
			if(player2_role.equals("raja")){
			    
			    j = j+100;
			    l = l+50;
			    playerTwoScore=j;
			    playerFourScore=l;
			}else{
			    
			    l = l+100;
			    j = j+50;
			    playerFourScore=l;
			    playerTwoScore=j;
			}
			}
		    if(player4_role.equals("chor"))
			{
			    l=l+25;
			    playerFourScore=l;
			    
			    if(player3_role.equals("raja")){
				
				k = k+100;
				j = j+50;
				playerTwoScore=j;
				playerThreeScore=k;
			    }else{
				
				j = j+100;
				k = k+50;
				playerThreeScore=k;
				playerTwoScore=j;
			    }
			}
    		}
	    
    	}
    if(player2_role.equals("mantri"))
    	{
	    if(guess)
    		{
    		Log.v("AkhandBakar", "##########Mantri"+ westPlayerName);
    		j = j+80;
    		playerTwoScore=j;
    		txtTurn.setText(westPlayerName+" is right!");
    		btnPod1.setText(player1);
		btnPod2.setText(player2);
		btnPod3.setText(player3);
		btnPod4.setText(player4);
		btnPod1.setBackgroundResource(R.drawable.podopen);
		btnPod2.setBackgroundResource(R.drawable.podopen);
		btnPod3.setBackgroundResource(R.drawable.podopen);
		btnPod4.setBackgroundResource(R.drawable.podopen);
    		if(playerOneRole.equals("chor"))
		    {
    			playerOneScore=i;
    			
    			if(player3_role.equals("raja")){
			    
			    k = k+100;
			    l = l+50;
    				playerThreeScore=k;
    				playerFourScore=l;
				
    			}else{
			    
			    l = l+100;
			    k = k+50;
			    playerFourScore=l;
			    playerThreeScore=k;
    			}
    			
		    }
    		if(player3_role.equals("chor"))
		    {
			
    			playerThreeScore=k;
    			
    			
    			if(playerOneRole.equals("raja")){
			    
			    i = i+100;
			    l = l+50;
			    playerOneScore=i;
			    playerFourScore=l;
			    
    			}else{
			    
			    l = l+100;
			    i = i+50;
			    playerOneScore=i;
			    playerFourScore=l;
			    
    			}
    			
    			}
    		if(player4_role.equals("chor"))
		    {
			
    			playerFourScore=l;
    			
    			if(playerOneRole.equals("raja")){
			    
			    i = i+100;
			    k = k+50;
			    playerOneScore=i;
			    playerThreeScore=k;
			    
    			}else{
			    
			    k = k+100;
    				i = i+50;
    				playerOneScore=i;
        			playerThreeScore=k;
    			
    			
    			}
    			
    			
    			}
    		}
    	else
    		{
    		 
    		j=j-80;
    		playerTwoScore = j;
    		txtTurn.setText(westPlayerName+" is wrong!");
    		btnPod1.setText(player1);
			btnPod2.setText(player2);
			btnPod3.setText(player3);
			btnPod4.setText(player4);
			btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod3.setBackgroundResource(R.drawable.podopen);
			btnPod4.setBackgroundResource(R.drawable.podopen);
			if(playerOneRole.equals("chor"))
			{
				i = i+25;
			playerOneScore=i;
			
			if(player3_role.equals("raja")){
			
				k = k+100;
				l = l+50;
				playerThreeScore=k;
				playerFourScore=l;
			
			}else{
				
				l = l+100;
				k = k+50;
				playerFourScore=l;
				playerThreeScore=k;
			}
			
			}
		if(player3_role.equals("chor"))
			{
			k = k+25;
			playerThreeScore=k;
			
			
			if(playerOneRole.equals("raja")){
				
				i = i+100;
				l = l+50;
				playerOneScore=i;
				playerFourScore=l;
				
			}else{
				
				l = l+100;
				i = i+50;
				playerOneScore=i;
				playerFourScore=l;
				
			}
			
			}
		if(player4_role.equals("chor"))
			{
			l = l+25;
			playerFourScore=l;
			
			if(playerOneRole.equals("raja")){
				
				i = i+100;
				k = k+50;
				playerOneScore=i;
    			playerThreeScore=k;
				
			}else{
				
				k = k+100;
				i = i+50;
				playerOneScore=i;
    			playerThreeScore=k;
			
			
			}
			
			
			}
    		}

    	}
    if(player3_role.equals("mantri"))
    	{
    	Log.v("AkhandBakar", "##########Mantri"+ southPlayerName);
    	if(guess)
    		{
    		k = k+80;
    		playerThreeScore = k;
    		txtTurn.setText(southPlayerName+" is right!");
    		btnPod1.setText(player1);
			btnPod2.setText(player2);
			btnPod3.setText(player3);
			btnPod4.setText(player4);
			btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod3.setBackgroundResource(R.drawable.podopen);
			btnPod4.setBackgroundResource(R.drawable.podopen);
    		if(playerOneRole.equals("chor"))
    			{
    			playerOneScore=i;
    			
    			if(player2_role.equals("raja")){
    				
    				j = j+100;
    				l = l+50;
    				playerTwoScore=j;
        			playerFourScore=l;
        			
    				
    			}else{
    				
    				l = l+100;
    				j = j+50;
    				playerTwoScore=j;
        			playerFourScore=l;
    				
    				
    			}
    			
    			}
    		if(player2_role.equals("chor"))
    			{
    			
    			playerTwoScore=j;
    			
    			
    			if(playerOneRole.equals("raja")){
    				
    				i = i+100;
    				l = l+50;
    				playerOneScore=i;
    				playerFourScore=l;
    				
    			}else{
    				
    				i = i+50;
    				l = l+100;
    				playerOneScore=i;
    				playerFourScore=l;
    				
    			}
    			
    			}
    		if(player4_role.equals("chor"))
    			{
    			
    			playerFourScore=l;
    			
    			if(player2_role.equals("raja")){
    				
    				j = j+100;
    				i = i+50;
    				playerOneScore=i;
        			playerTwoScore=j;
    				
    			}else{
    				
    				j = j+50;
    				i = i+100;
    				playerOneScore=i;
        			playerTwoScore=j;
    				
    			}
    			
    			
    			}
    		}
    	else
    		{
    		k = k-80;
    		playerThreeScore = k;
    		txtTurn.setText(southPlayerName+" is wrong!");
    		btnPod1.setText(player1);
		btnPod2.setText(player2);
		btnPod3.setText(player3);
		btnPod4.setText(player4);
		btnPod1.setBackgroundResource(R.drawable.podopen);
		btnPod2.setBackgroundResource(R.drawable.podopen);
		btnPod3.setBackgroundResource(R.drawable.podopen);
		btnPod4.setBackgroundResource(R.drawable.podopen);
		if(playerOneRole.equals("chor"))
		    {
				i = i+25;
				playerOneScore=i;
				
				if(player2_role.equals("raja")){
				
				    j = j+100;
				    l = l+50;
				    playerTwoScore=j;
				    playerFourScore=l;
				    
				    
				}else{
				    
				    l = l+100;
				    j = j+50;
				    playerTwoScore=j;
				    playerFourScore=l;
				    
				    
				}
				
		    }
		if(player2_role.equals("chor"))
		    {
			j = j+25;
			playerTwoScore=j;
			
			
			if(playerOneRole.equals("raja")){
				
			    i = i+100;
			    l = l+50;
			    playerOneScore=i;
			    playerFourScore=l;
			    
			}else{
			    
			    i = i+50;
			    l = l+100;
			    playerOneScore=i;
			    playerFourScore=l;
			    
			}
			
			}
		if(player4_role.equals("chor"))
		    {
			l = l+25;
			playerFourScore=l;
			
			if(player2_role.equals("raja")){
			    
			    j = j+100;
			    i = i+50;
			    playerOneScore=i;
			    playerTwoScore=j;
			    
			}else{
			    
			    j = j+50;
			    i = i+100;
			    playerOneScore=i;
			    playerTwoScore=j;
			    
			}
			
			
		    }
    		}
	
    	}
    if(player4_role.equals("mantri"))
    	{
	    Log.v("AkhandBakar", "##########Mantri"+ eastPlayerName);
	    if(guess)
    		{
		    l = l+80;
		    playerFourScore=l;
		    txtTurn.setText(eastPlayerName+" is right!");
		    btnPod1.setText(player1);
		    btnPod2.setText(player2);
		    btnPod3.setText(player3);
		    btnPod4.setText(player4);
		    btnPod1.setBackgroundResource(R.drawable.podopen);
		    btnPod2.setBackgroundResource(R.drawable.podopen);
		    btnPod3.setBackgroundResource(R.drawable.podopen);
		    btnPod4.setBackgroundResource(R.drawable.podopen);
		    if(playerOneRole.equals("chor"))
    			{
			    playerOneScore=i;
			    
			    
			    if(player2_role.equals("raja")){
    				
    				j = j+100;
    				k = k+50;
    				playerTwoScore=j;
        			playerThreeScore=k;
    				
			    }else{
    				
    				j = j+50;
    				k = k+100;
    				playerTwoScore=j;
        			playerThreeScore=k;
    				
			    }
    			}
		    if(player2_role.equals("chor"))
    			{
			    
			    playerTwoScore=j;
			    
			    
    			if(playerOneRole.equals("raja")){
			    
			    i = i+100;
			    k = k+50;
			    playerOneScore=i;
			    playerThreeScore=k;
    			}else{
			    
			    i = i+50;
			    k = k+100;
			    playerOneScore=i;
			    playerThreeScore=k;
			    
    			}
    			
    			}
		    if(player3_role.equals("chor"))
    			{
    			
			    playerThreeScore=k;
			    
			    if(playerOneRole.equals("raja")){
    				
    				i = i+100;
    				j = j+50;
    				playerOneScore=i;
        			playerTwoScore=j;
			    }else{
    				
    				i = i+50;
    				j = j+100;
    				playerOneScore=i;
        			playerTwoScore=j;
    				
			    }
			    
			    
    			}
    		}
    	else
	    {
    		l = l-80;
    		playerFourScore = l;
    		txtTurn.setText(eastPlayerName+" is wrong!");
    		btnPod1.setText(player1);
		btnPod2.setText(player2);
		btnPod3.setText(player3);
		btnPod4.setText(player4);
		btnPod1.setBackgroundResource(R.drawable.podopen);
		btnPod2.setBackgroundResource(R.drawable.podopen);
		btnPod3.setBackgroundResource(R.drawable.podopen);
		btnPod4.setBackgroundResource(R.drawable.podopen);
		if(playerOneRole.equals("chor"))
		    {
			i = i+25;
			playerOneScore=i;
			
			
			if(player2_role.equals("raja")){
			    
			    j = j+100;
			    k = k+50;
			    playerTwoScore=j;
			    playerThreeScore=k;
			    
			}else{
			    
			    j = j+50;
			    k = k+100;
			    playerTwoScore=j;
			    playerThreeScore=k;
				
			}
		    }
		if(player2_role.equals("chor"))
		    {
			j=j+25;
			playerTwoScore=j;
			
			
			if(playerOneRole.equals("raja")){
			    
			    i = i+100;
			    k = k+50;
			    playerOneScore=i;
			    playerThreeScore=k;
			}else{
			    
			    i = i+50;
			    k = k+100;
			    playerOneScore=i;
			    playerThreeScore=k;
			    
			}
			
			}
		if(player3_role.equals("chor"))
		    {
			k=k+25;
			playerThreeScore=k;
			
			if(playerOneRole.equals("raja")){
			    
			    i = i+100;
			    j = j+50;
			    playerOneScore=i;
			    playerTwoScore=j;
			}else{
				
			    i = i+50;
			    j = j+100;
			    playerOneScore=i;
			    playerTwoScore=j;
			    
			}
			
			
		    }
	    }
	    
    	}
    
    
    Log.v("AkhandBakar", "##########Score "+ i);
    txtPlayer1.setText("1."+ northPlayerName + " [" + i + "]");
    Log.v("AkhandBakar", player1 + " [" + i + "]");
    
    txtPlayer2.setText("2." + westPlayerName+ " [" + j + "]");
    
    Log.v("AkhandBakar", player2 + " [" + playerTwoScore + "]");
    
    txtPlayer3.setText("3." + southPlayerName+ " [" + k + "]");
    Log.v("AkhandBakar", player3 + " [" + playerThreeScore + "]");
    
    txtPlayer4.setText("4."+eastPlayerName+ " [" + l + "]");	
    Log.v("AkhandBakar", player4 + " [" + playerFourScore + "]");
    }
}
