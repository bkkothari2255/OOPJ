class Percentage{
	public static void main(String[] args){
	int subjects_marks[]= { 70 , 85 , 89, 77 , 66 ,  55};
	double avg_marks= 0.0d;
	for(int i=0;i<6;i++)
	avg_marks += subjects_marks[i];
	avg_marks /= subjects_marks.length;
	System.out.println(avg_marks);
	}
}
