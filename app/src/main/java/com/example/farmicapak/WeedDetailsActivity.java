package com.example.farmicapak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class WeedDetailsActivity extends AppCompatActivity {
    String label;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weed_details);

        description = findViewById(R.id.weedDescription);

        // Toolbar Configuration
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ImageView help = (ImageView) toolbar.findViewById(R.id.helpIcon);
        help.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(WeedDetailsActivity.this,ContactUs.class));
            }
        });

        if(ClickImageActivity.fromCamera)  // we are getting image from camera
        {
            label = ClickImageActivity.classification;
            ClickImageActivity.fromCamera = false;
        }
        else if (BrowserImageActivity.fromGallery)// image is from gallery
        {
            label = BrowserImageActivity.classification;
            BrowserImageActivity.fromGallery = false;
        }

        if (label != null)   // just  display the name of detected weed
        {
            TextView weedName = findViewById(R.id.weedName);
            weedName.setText(label);
            displayDetails(label); // and set the details for the weed
        }
    }

    public void displayDetails(String name)
    {
        String descriptionTxt; // will countain the description text

        if (name.equals("Chineeapple"))
        {
            description.setText("Large shrub or small spreading tree up to 8m tall and 10m in canopy diameter.\n" +
                    "2.\tBranches are dense, zigzag shaped, with leaf and thorn at each angle.\n" +
                    "3.\tLeaves are rounded, growing on alternating sides of branches, glossy green above, almost white underneath.\n" +
                    "4.\tFlowers are small, inconspicuous, greenish-white, unpleasant smelling.\n" +
                    "5.\tFruits are edible, pale yellow or orange when ripe, similar to cherry, 2.5cm in diameter\n" +
                    "6.\tHerbicide: Basal bark spray For stems up to 15 cm in diameter, carefully spray completely around the base of the plant to a height of 40 cm above ground level. It is important to thoroughly spray into the crevices of multi-stemmed plants. Larger trees may be controlled by spraying to a greater height, up to 100 cm above ground level. The best time for treatment is during autumn when plants are actively growing and soil moisture is good\n" +
                    "Herbicide: Basal bark spray\n" +
                    "Basal bark spray for stems up to 15 cm in diameter, carefully spray completely around the base of the plant to a height of 40 cm above ground level. It is important to thoroughly spray into the crevices of multi-stemmed plants. Larger trees may be controlled by spraying to a greater height, up to 100 cm above ground level. The best time for treatment is during autumn when plants are actively growing and soil moisture is good\n" +
                    "Benefits: \n" +
                    "1.\tThey contain small amounts of several vitamins and minerals but are particularly rich in vitamin C.\n" +
                    "2.\t An important vitamin with antioxidant and immune-boosting properties \n" +
                    "3.\t. They also contain a fair amount of potassium, which plays vital roles in muscle control and electrolyte balance.\n" +
                    "\n" +
                    "Non-Benefits:\n" +
                    "1.\tCreates impenetrable thickets that seriously hamper stock management.\n" +
                    "2.\tReduces pasture production and accessibility.\n");
        }
        else if (name.equals("Lantana"))
        {
            description.setText("Description:\n" +
                    "1.\tHeavily branched shrub growing in clumps, thickets or vines.\n" +
                    "Stems are square with small, recurred prickles.\n" +
                    "2.\tLeaves are bright green, about 6cm long, with round toothed edges, grow opposite one another along stem.\n" +
                    "3.\tFlowers vary in colour from pale cream to yellow, white, pink, orange, red, lilac and purple, about 2.5cm in diameter.\n" +
                    "4.\tFruits are glossy, rounded, fleshy, and purplish-black when ripe.\n" +
                    "Herbicide: Basal bark spraying and cut-stump methods also give good results at any time of year.\n" +
                    "Benefits:\n" +
                    "1.\tAlleviate Multiple Skin Disorders\n" +
                    "2.\tGood for bones and joints\n" +
                    "3.\tAstringent herbs\n" +
                    "4.\tTreat cough\n" +
                    "5.\tAlleviate Pain\n" +
                    "6.\tPrevent free radicals\n" +
                    "7.\tImprove Digestive System Health\n" +
                    "8.\tAddress Respiratory Issues\n" +
                    "9.\tStomach medicine\n" +
                    "10.\tIncrease appetite\n" +
                    "11.\tRemove toxins from the body\n" +
                    "12.\tTreat toothache\n" +
                    "13.\tOvercome vaginal discharge problems\n" +
                    "14.\tRepel Insects\n" +
                    "NON-Benefits:\n" +
                    "1.\tForms dense thickets that smother native vegetation.\n" +
                    "2.\tSome varieties are poisonous to stock.\n");
        }
        else if (name.equals("Negative"))
        {
            description.setText("Description: No Weed Plants Found.");

        }
        else if (name.equals("Parkinsonia"))
        {
            description.setText("Description:\n" +
                    "1.\tSmall, hairless tree up to 10m tall.\n" +
                    "2.\tBranches are slender, zigzag shaped, with sharp spines.\n" +
                    "3.\tLeaves have a short, spine-tipped stalk.\n" +
                    "4.\tLeaf branches are 20-40cm long.\n" +
                    "5.\tFlowers are yellow, fragrant, 5-petalled, each on a long, slender, drooping stalk.\n" +
                    "6.\tSeed pods are pencil-like, 5-10cm long, constricted between seeds.\n" +
                    "7.\tSeeds are oval, about 15mm long, with thick, extremely hard coat.\n" +
                    "Herbicide: \n" +
                    "           There are two Herbicide that are used :\n" +
                    "1.\tFoliar spray: This is an effective control method for seedlings up to 1.5m tall. Spray leaf and stems to point of run-off. A wetting agent must be used.\n" +
                    "2.\tBasal bark spray: For stems up to 15cm in diameter, carefully spray around base of plant to 30cm above ground level. Larger trees may be controlled by spraying to a greater height, up to 100cm above ground level\n" +
                    "NON-Benefits:\n" +
                    "1.\tNON-Benefits: Forms dense, often impenetrable, thorny thickets along watercourses and bore drains.\n" +
                    "2.\tFlooded country is particularly susceptible to invasion from floating seeds.\n" +
                    "3.\tProvides haven for feral pigs, which prey on livestock, damage crops, and degrade environment.\n");

        }
        else if (name.equals("Parthenium"))
        {
            description.setText("Description:\n" +
                    "\n" +
                    "1.\tAnnual herb up to 1-1.5m tall, developing many branches in its top half when mature.\n" +
                    "2.\tLeaves are pale green, up to 2mm long, deeply lobed, covered with fine, soft hairs.\n" +
                    "3.\tFlowers are small, creamy-white, on stem tips 4-10mm in a 5-sided shape.\n" +
                    "4.\tFlowers have 4-5 wedge-shaped, black seeds, 2mm long with 2 thin, white scales.\n" +
                    "Herbicide:\n" +
                    "1.\tGlyphosate + metsulfuron\n" +
                    "2.\tParaquat + diquat (Group L)\n" +
                    "\n" +
                    "Benefits: \n" +
                    "1.\tParthenium hysterophorus confers many health benefits like:\n" +
                    "2.\tInflammation\n" +
                    "3.\t rheumatic pain\n" +
                    "4.\tDiarrhoea\n" +
                    "5.\turinary tract infections\n" +
                    "6.\t dysentery\n" +
                    "7.\t malaria and neuralgia.\n" +
                    "NON-Benefits:\n" +
                    "1.\tInvades disturbed bare areas along roadsides, heavily stocked areas around yards, and watering points.\n" +
                    "2.\tInvades pastures.\n" +
                    "3.\tReduces beef production.\n" +
                    "4.\tCosts cropping industries millions of dollars per year.\n" +
                    "5.\tCompetes with crops for nutrients and space.\n");

        }
        else if (name.equals("Pricklyacaia"))
        {
            description.setText("Description:\n" +
                    "1.\tThorny shrub or small tree up to 5-10m tall.\n" +
                    "2.\tThorns are paired, stout, generally around 1-5cm long.\n" +
                    "3.\tFlowers are golden-yellow, ball-shaped, growing on stems from leaf joints with 2-6 flowers per group.\n" +
                    "4.\tLeaves are fern-like, 4-10 pairs of leaf branches, 10-20 pairs of narrow green leaflets on each branch.\n" +
                    "5.\tPods are flat, 10-15cm, with narrow constrictions between seeds, greyish when ripe.\n" +
                    "6.\tBark on saplings has a tinge of orange and/or green, older trees have dark, rough bark.\n" +
                    "\n" +
                    "Herbicide:\n" +
                    "1.\tBasal bark\n" +
                    "2.\tFoliar spray\n" +
                    "NON-Benefits:\n" +
                    "1.\tDegrades soil by facilitating erosion.\n" +
                    "2.\tThreatens biodiversity through transformation of natural grasslands into thorny scrub and woodland.\n");

        }else if (name.equals("Rubber vine"))
        {
            description.setText("Description:\n" +
                    "1.\tClimbing vine up to 30m tall in trees, untidy shrub up to 1-2m tall.\n" +
                    "2.\tLeaves are dark green, glossy, 6-10cm long, 3-5cm wide, in opposite pairs.\n" +
                    "3.\tLeaves, stems and unripe pods exude a white, milky sap when broken or cut.\n" +
                    "4.\tFlowers are large and showy, with 5 white to light purple, funnel-shaped petals.\n" +
                    "5.\tSeed pods are distinctive, rigid, grow in pairs at end of short stalk.\n" +
                    "6.\tPods are 10-12cm long, 3-4cm wide, have white tufts of long, silky hair, contain up to 450 brown seeds.Benefits:\n" +
                    "Herbicide:\n" +
                    "1.\tFoliar spray\n" +
                    "2.\tBasal bark treatment\n" +
                    "3.\tCut stump treatment\n" +
                    "NON-Benefits: \n" +
                    "1.\tRubber vine is poisonous; it contains cardiac glycosides that interfere with heart operation.\n" +
                    "2.\t When eaten it also causes severe stomach and intestinal upset.\n" +
                    "3.\t Stock find it unpalatable but may eat it when feed is scarce and dry. \n" +
                    "4.\tIts rampant growth may restrict their access to water points. \n" +
                    "5.\tIt damages the environment by smothering and pulling down riverside vegetation.\n");

        }else if (name.equals("Siamweed"))
        {
            description.setText("Description:\n" +
                    "1.\tDense, tangling bush up to 2-3m tall.\n" +
                    "2.\tScrambles up trees to 20m.\n" +
                    "3.\tRoot system is fibrous, shallow in most soils.\n" +
                    "4.\tDevelops an enlargement at junction of stem and root, called a basal ball.\n" +
                    "5.\tLeaves are soft, green, hairy, roughly triangular in shape, with distinctive 'pitchfork' 3-vein pattern.\n" +
                    "6.\tNew leaf growth can have purple colouration.\n" +
                    "7.\tLeaves emit a distinctive odour when crushed.\n" +
                    "8.\tStems are smooth, round, fairly brittle, base becomes woody when old.\n" +
                    "9.\tFlowers are pale lilac, appearing white from a distance.\n" +
                    "Herbicide:\n" +
                    "1.\tTriclopyr 300 g/L + Picloram 100 g/L (e.g. Conqueror) or Triclopyr 300 g/L + Picloram 100 g/L + Aminopyralid 8 g/L (Grazon Extra)\n" +
                    "NON-Benefits:\n" +
                    "1.\tQuickly invades and smothers native vegetation.\n" +
                    "2.\tOut-competes native vegetation.\n" +
                    "3.\tIncreases frequency and intensity of bushfires.\n" +
                    "\n");

        }else if (name.equals("Snakeweed"))
        {
            description.setText("Description:\n" +
                    "1.\tPerennial shrub up to 1.5m tall.\n" +
                    "2.\tLeaves are 10cm long, oval-shaped, tapering at base to short stalk, in pairs along stem.\n" +
                    "3.\tEach flower has 5mm-wide tube that opens into 5 petals, can be white, dark blue, purple, pink or red.\n" +
                    "4.\tFlowers are on stiff spikes 25cm long.\n" +
                    "5.\tFlower spikes have 'snakeskin' appearance that develops as flower dries.\n" +
                    "6.\tFruit is oblong, 3-6mm long, 1.5-2mm wide.\n" +
                    "\n" +
                    "Herbicide: 2,4-D amine\n" +
                    "NON-Benefits:\n" +
                    "1.\tInvades roadsides and disturbed land.\n" +
                    "2.\tCan invade pastures in wetter areas.\n");
        }

    }


}