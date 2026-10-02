// entry=0x6de54

void H6de54(undefined8 param_1,ulong param_2,undefined8 param_3,long param_4)

{
  bool bVar1;
  undefined **ppuVar2;
  long unaff_x20;
  long unaff_x23;
  
  *(undefined1 *)(unaff_x20 + param_2) =
       *(undefined1 *)
        (unaff_x23 +
         ((-DAT_00283670 ^ 0xcc01dc932bc9ebe3U) + (-DAT_00283670 & 0xcc01dc932bc9ebe3U) * 2) * 0x14
        + param_4);
  bVar1 = (long)((-DAT_00283670 | 0xcc01dc932bc9ebe3U) + (-DAT_00283670 & 0xcc01dc932bc9ebe3U)) <
          param_4;
  ppuVar2 = &PTR_H6de54_00280318;
  if (bVar1 == 0x1ff < (param_2 | 1) * 2 - (param_2 ^ 1) || !bVar1) {
    ppuVar2 = &PTR_LAB_00277838;
  }
                    /* WARNING: Could not recover jumptable at 0x0016df14. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


