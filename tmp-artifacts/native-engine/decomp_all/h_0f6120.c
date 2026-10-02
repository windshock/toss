// entry=0xf6120

void Hf6120(undefined4 param_1)

{
  undefined4 *unaff_x26;
  
  *unaff_x26 = param_1;
  unaff_x26[2] = 0;
  unaff_x26[3] = 0;
  unaff_x26[1] = unaff_x26[1] & 0x80 | unaff_x26[1] ^ 0x80;
                    /* WARNING: Could not recover jumptable at 0x001f6198. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00282528)(param_1,unaff_x26 + 4);
  return;
}


