// entry=0x4ed24

void H4eb18(undefined8 param_1,long param_2)

{
  undefined **ppuVar1;
  ulong uVar2;
  undefined8 in_x5;
  undefined8 in_x6;
  undefined8 uVar3;
  undefined8 uVar4;
  ulong in_x16;
  long unaff_x19;
  
  if ((in_x16 & 1) == 0) {
                    /* WARNING: Could not recover jumptable at 0x00153d64. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027f1f8)();
    return;
  }
  uVar3 = *(undefined8 *)(unaff_x19 + 0x170);
  uVar4 = *(undefined8 *)(unaff_x19 + 0x168);
  *(undefined1 *)
   (param_2 + (-DAT_00275ca8 ^ 0x642804bbf97b18d3U) + (-DAT_00275ca8 & 0x642804bbf97b18d3U) * 2) = 0
  ;
  uVar2 = (-DAT_00275ca8 | 0x642804bbf97b1470U) * 2 - (-DAT_00275ca8 ^ 0x642804bbf97b1470U);
  CallSupervisor(0);
  ppuVar1 = &PTR_LAB_002789f0;
  if (uVar2 < 0xfffffffffffff001) {
    ppuVar1 = &PTR_LAB_00279698;
  }
                    /* WARNING: Could not recover jumptable at 0x00150c68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(uVar2,param_2,param_2,*(undefined8 *)(unaff_x19 + 0x130),in_x5,in_x6,uVar3,
                      uVar4);
  return;
}


