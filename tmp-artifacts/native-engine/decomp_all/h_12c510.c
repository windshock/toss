// entry=0x12c510

void H11e9d0(void)

{
  undefined8 in_x10;
  undefined8 in_x11;
  long unaff_x19;
  undefined1 auStack_840 [2064];
  undefined1 auStack_30 [16];
  undefined1 auStack_20 [32];
  
  *(undefined8 *)(unaff_x19 + 0x828) = in_x11;
  *(undefined8 *)(unaff_x19 + 0x838) = in_x10;
  *(undefined1 **)(unaff_x19 + 0x810) = auStack_20;
  *(undefined1 **)(unaff_x19 + 0x520) = auStack_30;
  *(undefined1 **)(unaff_x19 + 0x808) = auStack_840;
                    /* WARNING: Could not recover jumptable at 0x0021ea48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00278658)
            [(int)((-(int)DAT_00281e58 | 0xcc88cf92U) + (-(int)DAT_00281e58 & 0xcc88cf92U))])();
  return;
}


