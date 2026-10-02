// entry=0x148900

void H148900(void)

{
  undefined1 uVar1;
  ulong uVar2;
  long in_x10;
  undefined8 *in_x13;
  ulong in_x14;
  undefined8 *in_x15;
  long unaff_x19;
  long unaff_x22;
  ulong unaff_x26;
  
  uVar1 = **(undefined1 **)(unaff_x19 + 0x300);
  uVar2 = (unaff_x26 | -*(long *)(unaff_x22 + 0x260)) * 2 -
          (unaff_x26 ^ -*(long *)(unaff_x22 + 0x260));
  *(undefined1 **)(unaff_x19 + 0x300) =
       *(undefined1 **)(unaff_x19 + 0x300) +
       (unaff_x26 ^ -*(long *)(unaff_x22 + 0x260)) + (unaff_x26 & -*(long *)(unaff_x22 + 0x260)) * 2
  ;
  if ((in_x14 ^ uVar2) + (in_x14 & uVar2) * 2 != in_x10) {
    in_x13 = in_x15;
  }
                    /* WARNING: Could not recover jumptable at 0x002488fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*in_x13)(uVar1);
  return;
}


