// entry=0x83974

void H83974(void)

{
  long unaff_x19;
  
  *(byte *)(unaff_x19 + 2) =
       (-(char)DAT_00274480 & 0x7fU | 0x2a) * '\x02' - (-(char)DAT_00274480 ^ 0x2aU);
  *(undefined1 *)
   (unaff_x19 + (-DAT_00274480 ^ 0x99bbd15a94f8c2f5U) + (-DAT_00274480 & 0x99bbd15a94f8c2f5U) * 2) =
       0;
                    /* WARNING: Could not recover jumptable at 0x001839e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00282e38)();
  return;
}


