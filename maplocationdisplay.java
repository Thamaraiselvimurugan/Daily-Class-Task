package displaymap;



import java.awt.FlowLayout;

import java.awt.event.*;



import javax.swing.*;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.InputStream;

import java.io.OutputStream;

import java.net.URL;

import javax.swing.ImageIcon;

import javax.swing.JFrame;

import javax.swing.JLabel;

public class MyWind extends JFrame{



    public MyWind() {

        initialize();

         }



    private void initialize() {

        setSize(300, 300);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        



        JComboBox comboBox = new JComboBox();

        comboBox.setEditable(true);

        comboBox.addItem("newyork");

        comboBox.addItem("chennai");

        comboBox.addItem("New Delhi");

        comboBox.addItem("Tokyo");

        comboBox.addItem("Paris");

        

  

        //

        // Create an ActionListener for the JComboBox component.

        //

        comboBox.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {

                //

                // Get the source of the component, which is in our combo

                // box.

                //

                JComboBox comboBox = (JComboBox) event.getSource();



                Object selected = comboBox.getSelectedItem();

                if(selected.toString().equals("newyork"))

                

                {

                	newyork();

                }

                else if(selected.toString().equals("chennai"))

                {

                	chennai();

                }

                else if(selected.toString().equals("New Delhi"))

                {

                	newdelhi();

                }

                else if(selected.toString().equals("Tokyo"))

                {

                	tokyo();

                }

                

                else if(selected.toString().equals("Paris"))

                {

                	paris();

                }



            }

        });

        getContentPane().add(comboBox);

        

    }

public void newyork()

{



		JFrame test = new JFrame("New york");

		try {

		String latitude = "40.714728";

		String longitude = "-73.998672";

		String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="

		+ latitude

		+ ","

		+ longitude

		+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";

		String destinationFile = "image.jpg";

		// read the map image from Google

		// then save it to a local file: image.jpg

		//

		URL url = new URL(imageUrl);

		InputStream is = url.openStream();

		OutputStream os = new FileOutputStream(destinationFile);

		byte[] b = new byte[2048];

		int length;

		while ((length = is.read(b)) != -1) {

		os.write(b, 0, length);

		}

		is.close();

		os.close();

		} catch (IOException e) {

		e.printStackTrace();

		System.exit(1);

		}

		// create a GUI component that loads the image: image.jpg

		//

		ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))

		.getImage().getScaledInstance(630, 600,

		java.awt.Image.SCALE_SMOOTH));

		test.add(new JLabel(imageIcon));

		// show the GUI window

		test.setVisible(true);

		test.pack();

		}

public void chennai() {

	

		JFrame test = new JFrame("Chennai");

		try {

		String latitude = "13.0827";

		String longitude = "80.2707";

		String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="

		+ latitude

		+ ","

		+ longitude

		+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";

		String destinationFile = "image.jpg";

		// read the map image from Google

		// then save it to a local file: image.jpg

		//

		URL url = new URL(imageUrl);

		InputStream is = url.openStream();

		OutputStream os = new FileOutputStream(destinationFile);

		byte[] b = new byte[2048];

		int length;

		while ((length = is.read(b)) != -1) {

		os.write(b, 0, length);

		}

		is.close();

		os.close();

		} catch (IOException e) {

		e.printStackTrace();

		System.exit(1);

		}

		// create a GUI component that loads the image: image.jpg

		//

		ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))

		.getImage().getScaledInstance(630, 600,

		java.awt.Image.SCALE_SMOOTH));

		test.add(new JLabel(imageIcon));

		// show the GUI window

		test.setVisible(true);

		test.pack();

		}

public void newdelhi()

{

	JFrame test = new JFrame("New Delhi");

	try {

	String latitude = "28.6139";

	String longitude = "77.2090";

	String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="

	+ latitude

	+ ","

	+ longitude

	+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";

	String destinationFile = "image.jpg";

	// read the map image from Google

	// then save it to a local file: image.jpg

	//

	URL url = new URL(imageUrl);

	InputStream is = url.openStream();

	OutputStream os = new FileOutputStream(destinationFile);

	byte[] b = new byte[2048];

	int length;

	while ((length = is.read(b)) != -1) {

	os.write(b, 0, length);

	}

	is.close();

	os.close();

	} catch (IOException e) {

	e.printStackTrace();

	System.exit(1);

	}

	// create a GUI component that loads the image: image.jpg

	//

	ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))

	.getImage().getScaledInstance(630, 600,

	java.awt.Image.SCALE_SMOOTH));

	test.add(new JLabel(imageIcon));

	// show the GUI window

	test.setVisible(true);

	test.pack();

	}

public void tokyo()

{JFrame test = new JFrame("Tokyo");

try {

String latitude = "35.6895";

String longitude = "139.6917";

String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="

+ latitude

+ ","

+ longitude

+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";

String destinationFile = "image.jpg";

// read the map image from Google

// then save it to a local file: image.jpg

//

URL url = new URL(imageUrl);

InputStream is = url.openStream();

OutputStream os = new FileOutputStream(destinationFile);

byte[] b = new byte[2048];

int length;

while ((length = is.read(b)) != -1) {

os.write(b, 0, length);

}

is.close();

os.close();

} catch (IOException e) {

e.printStackTrace();

System.exit(1);

}

// create a GUI component that loads the image: image.jpg

//

ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))

.getImage().getScaledInstance(630, 600,

java.awt.Image.SCALE_SMOOTH));

test.add(new JLabel(imageIcon));

// show the GUI window

test.setVisible(true);

test.pack();

}



public void paris()

{

	JFrame test = new JFrame("paris");

	try {

	String latitude = "48.8566";

	String longitude = "2.3522";

	String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="

	+ latitude

	+ ","

	+ longitude

	+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";

	String destinationFile = "image.jpg";

	// read the map image from Google

	// then save it to a local file: image.jpg

	//

	URL url = new URL(imageUrl);

	InputStream is = url.openStream();

	OutputStream os = new FileOutputStream(destinationFile);

	byte[] b = new byte[2048];

	int length;

	while ((length = is.read(b)) != -1) {

	os.write(b, 0, length);

	}

	is.close();

	os.close();

	} catch (IOException e) {

	e.printStackTrace();

	System.exit(1);

	}

	// create a GUI component that loads the image: image.jpg

	//

	ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))

	.getImage().getScaledInstance(630, 600,

	java.awt.Image.SCALE_SMOOTH));

	test.add(new JLabel(imageIcon));

	// show the GUI window

	test.setVisible(true);

	test.pack();

	}



		

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

            	

                new MyWind().setVisible(true);

            }

        });

    }

}