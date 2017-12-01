package com.puzzle;

public class TwoCircles {

	enum CircleRelation {
		Touching,
		Concentric,
		Intersecting,
		Disjoint_Outside,
		Disjoint_Inside		
	};

	private static double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
	}
	
	private static CircleRelation circleRelation(int x1, int y1, int r1,
			int x2, int y2, int r2) {
		
		if (x1==x2 && y1==y2) {
			return CircleRelation.Concentric;
		}
		
		double centerDistance = distance(x1, y1, x2, y2);
		int big = Math.max(r1, r2);
		int small = Math.min(r1, r2);
		if (big > small + centerDistance) {		// inside disjoint
			return CircleRelation.Disjoint_Inside;
		}
		
		if (big == small + centerDistance) { // inside touch
			return CircleRelation.Touching;
		}
		
		if (big + small == centerDistance) { // outside touch
			return CircleRelation.Touching;
		}
		
		if ( big + small < centerDistance) { // outside disjoint
			return CircleRelation.Disjoint_Outside;
		}

		return CircleRelation.Intersecting;

	}
	
	public static void main(String[] args) {
		int num = 6;
		String[] infos = new String[num];
		int i = 0;
		infos[i++] = "0 10 8 0 10 3";
		infos[i++] = "10 0 8 0 10 3";
		infos[i++] = "0 10 8 0 20 2";
		infos[i++] = "0 10 8 0 100 3";
		infos[i++] = "0 10 8 0 9 3";
		infos[i++] = "0 10 8 0 5 8";

		for (String info: infos) {
			String[] input = info.split(" ");
			assert(input.length == 6);
			int j = 0;
			int x1 = Integer.valueOf(input[j++]);
			int y1 = Integer.valueOf(input[j++]);
			int r1 = Integer.valueOf(input[j++]);
			int x2 = Integer.valueOf(input[j++]);
			int y2 = Integer.valueOf(input[j++]);
			int r2 = Integer.valueOf(input[j++]);
			
			CircleRelation relation = circleRelation(x1, y1, r1, x2, y2, r2);
			System.out.println(relation);

		}
	}

}
